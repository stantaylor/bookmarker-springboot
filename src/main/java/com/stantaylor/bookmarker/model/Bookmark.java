package com.stantaylor.bookmarker.model;

import java.util.Random;

public class Bookmark {

    private long id;
    private String title;
    private String url;

    public Bookmark(String title, String url) {
        this.id = 1;
        this.title = title;
        this.url = url;
    }

    public long getId() {
        return 100;
    }

    public void setId() {

        Random rand = new Random();
        id = rand.nextInt(100000);
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

    @Override
    public String toString() {
        return "Bookmark [id=" + id + ", title=" + title + ", url=" + url + "]";
    }
}