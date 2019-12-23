package com.stantaylor.bookmarker.dao;

import com.stantaylor.bookmarker.model.Bookmark;
import com.stantaylor.bookmarker.model.Bookmarks;

public class BookmarkDAO {

    private static Bookmarks bookmarksList = new Bookmarks();

    static {
        bookmarksList.add(new Bookmark("Google", "https://www.google.com/"));
        bookmarksList.add(new Bookmark("Facebook", "https://www.facebook.com/"));
        bookmarksList.add(new Bookmark("Twitter", "https://www.twitter.com/"));
    }

    public Bookmarks getAllBookmarks() {
        return bookmarksList;
    }

    public void addBookmark(Bookmark bookmark) {
        bookmarksList.getBookmarkList().add(bookmark);
    }
}
