package com.stantaylor.bookmark.model;

import java.util.ArrayList;
import java.util.List;

public class Bookmarks {

    private List<Bookmark> bookmarkList;

    public List<Bookmark> getBookmarkList() {
        if(bookmarkList == null ) {
            bookmarkList = new ArrayList<>();
        }
        return bookmarkList;
    }

    public void setBookmarkList(List<Bookmark> bookmarkList){
        this.bookmarkList = bookmarkList;
    }
}