package com.stantaylor.bookmarker.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Bookmarks {


    private ArrayList<Bookmark> bookmarkList;

    public ArrayList<Bookmark> getBookmarkList() {
        if(bookmarkList == null ) {
            bookmarkList = new ArrayList<>();
        }
        return bookmarkList;
    }

    public void setBookmarkList(ArrayList<Bookmark> bookmarkList){
        this.bookmarkList = bookmarkList;
    }

    public void add(Bookmark bookmark) {
        bookmarkList.add(bookmark);
    }
}