package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.model.Bookmark;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import static com.stantaylor.bookmarker.hibernate.util.HibernateUtil.getSessionFactory;

@Repository
public class BookmarkController {

    public static Integer create(Bookmark b) {
        Session session = getSessionFactory().openSession();
        b.setInsertTime(new Date());
        session.beginTransaction();
        session.save(b);
        session.getTransaction().commit();
        session.close();
        return b.getId();
    }

    public static void update(Bookmark b) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Bookmark bm = session.load(Bookmark.class, b.getId());
        bm.setTitle(b.getTitle());
        bm.setUrl(b.getUrl());
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(Integer id) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Bookmark b = findByID(id);
        session.delete(b);
        session.getTransaction().commit();
        session.close();
    }

    public static Bookmark findByID(Integer id) {
        Session session = getSessionFactory().openSession();
        Bookmark b = session.load(Bookmark.class, id);
        session.close();
        return b;
    }

    public List<Bookmark> getAll() {
        Session session = getSessionFactory().openSession();
        List<Bookmark> bookmarks = session.createQuery("from Bookmark", com.stantaylor.bookmarker.model.Bookmark.class).getResultList();
        session.close();
        return bookmarks;

    }
}