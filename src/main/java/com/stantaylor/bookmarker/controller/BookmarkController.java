package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.model.Bookmark;
import com.stantaylor.bookmarker.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//import com.stantaylor.bookmarker.model.Bookmark;
//import org.hibernate.Session;
//import org.springframework.stereotype.Repository;
//
//import java.util.Date;
//import java.util.List;
//
//import static com.stantaylor.bookmarker.hibernate.util.HibernateUtil.getSessionFactory;
//
@RestController
public class BookmarkController {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @GetMapping("/bookmarks")
    public Page<Bookmark> getBookmarks(Pageable pageable) {
        return bookmarkRepository.findAll(pageable);
    }

    // see https://www.callicoder.com/spring-boot-jpa-hibernate-postgresql-restful-crud-api-example/

//    @GetMapping("/bookmarks/{id}")
//    public  Bookmark getBookmarkById(@PathVariable Long id){
//
//        return BookmarkRepository.getOne(id);
//
//    }

//    @PostMapping("/bookmarks")
//    public Bookmark createBookmark(@Valid @RequestBody Bookmark bookmark) {
//
//        return BookmarkRepository.save(bookmark);
//    }


}