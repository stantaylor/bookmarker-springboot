package com.stantaylor.bookmarker.view;

public class BookmarkView {

    public void printBookmarkDetails(int id, String title, String url){
        System.out.println("Bookmark: ");
        System.out.println("  ID:    " + id);
        System.out.println("  Title: " + title);
        System.out.println("  URL:   " + url);
    }
}
