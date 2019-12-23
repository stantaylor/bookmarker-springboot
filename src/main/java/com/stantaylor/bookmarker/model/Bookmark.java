package com.stantaylor.bookmarker.model;

import java.util.Random;

public class Bookmark {

    private int id;
    private String title;
    private String url;

    public Bookmark(String title, String url) {
        this.id = setId();
        this.title = title;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public int setId() {
        Random rand = new Random(System.currentTimeMillis());
        id = rand.nextInt(100000);
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setUrl(String u) {
        url = u;
    }

    public String getUrl() {
        return url;
    }

}