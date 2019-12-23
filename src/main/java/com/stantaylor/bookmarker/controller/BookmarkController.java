package com.stantaylor.bookmarker.controller;

import com.stantaylor.bookmarker.dao.BookmarkDAO;
import com.stantaylor.bookmarker.model.Bookmark;
import com.stantaylor.bookmarker.model.Bookmarks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

    @Autowired
    private BookmarkDAO bookmarkDAO;

    @GetMapping(path="/", produces = "application/json")
    public Bookmarks getBookmarks()
    {
        return bookmarkDAO.getAllBookmarks();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addBookmark(@RequestBody Bookmark bookmark){

        bookmark.setId();
        bookmarkDAO.addBookmark(bookmark);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bookmark.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}