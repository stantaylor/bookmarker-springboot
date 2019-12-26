package com.stantaylor.bookmarker;

import com.stantaylor.bookmarker.controller.BookmarkController;
import com.stantaylor.bookmarker.model.Bookmark;
import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Application {

    private static SessionFactory factory;

    public static void main(String[] args) {


        String snippet = RandomStringUtils.randomAlphabetic(10);
        Bookmark b = new Bookmark(snippet, "http://www." + snippet + ".com/");
        b.setInsertTime(new Date());

        Integer id = BookmarkController.create((b));
        System.out.println("Created new bookmark");
        System.out.println(  "id        : " + b.getId());
        System.out.println("  title     : " + b.getTitle());
        System.out.println("  url       : " + b.getUrl());
        System.out.println("  insertTime: " + b.getInsertTime().toString());


        Bookmark newBm = BookmarkController.findByID(b.getId());
        System.out.println("Got new bookmark: ");
        System.out.println(  "id        : " + newBm.getId());
        System.out.println("  title     : " + newBm.getTitle());
        System.out.println("  url       : " + newBm.getUrl());
        System.out.println("  insertTime: " + newBm.getInsertTime().toString());



    }


}
