package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.model.Bookmark;
import org.hibernate.Session;

import static com.stantaylor.bookmarker.hibernate.util.HibernateUtil.getSessionFactory;

public class BookmarkController {

    public static Integer create(Bookmark b) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(b);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created " + b.toString());
        return b.getId();
    }

}