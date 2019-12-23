package com.stantaylor.bookmarker.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Bookmarks {


    private ArrayList<Bookmark> bookmarkList;

    public ArrayList<Bookmark> getAllBookmarks() {
        if(bookmarkList == null ) {
            bookmarkList = new ArrayList<>();
        }
        return bookmarkList;
    }

    public void add(Bookmark bookmark) {
        bookmarkList.add(bookmark);
    }
}