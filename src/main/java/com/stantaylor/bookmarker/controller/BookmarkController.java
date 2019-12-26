package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.model.Bookmark;
import org.hibernate.Session;

import java.util.Date;

import static com.stantaylor.bookmarker.hibernate.util.HibernateUtil.getSessionFactory;

public class BookmarkController {

    public static Integer create(Bookmark b) {
        Session session = getSessionFactory().openSession();
        b.setInsertTime(new Date());
        session.beginTransaction();
        session.save(b);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created " + b.toString());
        return b.getId();
    }

    public static Bookmark findByID(Integer id) {
        Session session = getSessionFactory().openSession();
        Bookmark b = (Bookmark) session.load(Bookmark.class, id);
        session.close();
        return b;
    }
}