package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.model.Bookmark;
import com.stantaylor.bookmarker.model.Bookmarks;
import com.stantaylor.bookmarker.view.BookmarkView;


public class BookmarkController {

    private Bookmark model;
    private BookmarkView view;

    public BookmarkController(Bookmark model, BookmarkView view){
        this.model = model;
        this.view = view;
    }

    public void setBookmarkId(){
        model.setId();
    }

    public int getBookmarkId(){
        return model.getId();
    }

    public void setBookmarkTitle(String title){
        model.setTitle(title);
    }

    public String getBookmarkTitle() {
        return model.getTitle();
    }

    public void setBookmarkUrl(String url){
        model.setUrl(url);
    }

    public String getBookmarkUrl(){
        return model.getUrl();
    }

    public void updateView() {
        view.printBookmarkDetails(model.getId(), model.getTitle(), model.getUrl());
    }

}