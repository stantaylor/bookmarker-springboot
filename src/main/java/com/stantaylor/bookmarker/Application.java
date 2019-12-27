package com.stantaylor.bookmarker;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static SessionFactory factory;

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);

//        // create a new bookmark
//        String snippet = RandomStringUtils.randomAlphabetic(10);
//        Bookmark b = new Bookmark(snippet, "http://www." + snippet + ".com/");
//
//        Integer id = BookmarkController.create((b));
//        System.out.println("**********************************************************");
//        System.out.println("Created new bookmark");
//        System.out.println("  id:          " + b.getId());
//        System.out.println("  title:       " + b.getTitle());
//        System.out.println("  url:         " + b.getUrl());
//        System.out.println("  insert_time: " + b.getInsertTime());
//
//        // update the new bookmark
//        snippet = RandomStringUtils.randomAlphabetic(10);
//        b.setTitle(b.getTitle() + " " + snippet);
//        BookmarkController.update(b);
//        System.out.println("**********************************************************");
//        System.out.println("Updated bookmark: ");
//        System.out.println("  id:          " + b.getId());
//        System.out.println("  title:       " + b.getTitle());
//        System.out.println("  url:         " + b.getUrl());
//        System.out.println("  insert_time: " + b.getInsertTime());
//
//        // add a second bookmark
//        snippet = RandomStringUtils.randomAlphabetic(10);
//        b = new Bookmark(snippet, "http://www." + snippet + ".com/");
//        id = BookmarkController.create((b));
//
//        // get all bookmarks
//        List<Bookmark> bookmarks = BookmarkController.getAll();
//        for (Integer i = 0; i < bookmarks.size(); i++) {
//                Bookmark thisBookmark = bookmarks.get(i);
//            System.out.println("  id:          " + thisBookmark.getId());
//            System.out.println("  title:       " + thisBookmark.getTitle());
//            System.out.println("  url:         " + thisBookmark.getUrl());
//            System.out.println("  insert_time: " + thisBookmark.getInsertTime());
//        }
//
//        // get teh number of bookmarks
//        Integer total = bookmarks.size();
//
//        // delete a bookmark
//        BookmarkController.delete(b.getId());
//
//        // make sure that there is one fewer bookmark now
//        bookmarks = BookmarkController.getAll();
//        Integer newTotal = bookmarks.size();
//
//        if (newTotal != total -1 ){
//            throw new Exception("Found wrong number of bookmarks");
//        }

    }

}
