package com.stantaylor.bookmarker;

import com.stantaylor.bookmarker.controller.BookmarkController;
import com.stantaylor.bookmarker.model.Bookmark;
import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Application {

    private static SessionFactory factory;

    public static void main(String[] args) {

        Bookmark bm = new Bookmark();

        String snippet = RandomStringUtils.randomAlphabetic(10);
        bm.setTitle(snippet);
        bm.setUrl("http://www." + snippet + ".com/");
        bm.setInsertTime(new Date());

        Integer id = BookmarkController.create((bm));
        System.out.println("id: " + id.toString());


    }


}
