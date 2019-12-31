package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.exception.ResourceNotFoundException;
import com.stantaylor.bookmarker.model.Bookmark;
import com.stantaylor.bookmarker.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/bookmarks/{id}")
    public Bookmark getBookmarkById(@PathVariable Long id) {

        return bookmarkRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bookmark not found with id " + id));

    }

    @PostMapping("/bookmarks")
    public Bookmark createBookmark(@Valid @RequestBody Bookmark bookmark) {

        return bookmarkRepository.save(bookmark);
    }

    @PutMapping("/bookmarks/{id}")
    public Bookmark updateBookmark(@PathVariable Long id,
                                   @Valid @RequestBody Bookmark bookmarkRequest) {
        return bookmarkRepository.findById(id)
                .map(bookmark -> {
                    bookmark.setTitle(bookmarkRequest.getTitle());
                    bookmark.setUrl(bookmarkRequest.getUrl());
                    return bookmarkRepository.save(bookmark);
                }).orElseThrow(() -> new ResourceNotFoundException("Bookmark not found with id " + id));
    }

}