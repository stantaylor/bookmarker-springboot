package com.stantaylor.bookmarker;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stantaylor.bookmarker.controller.BookmarkController;
import com.stantaylor.bookmarker.model.Bookmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class BookmarkerRestController {

    @Autowired
    private BookmarkController bookmarkController;

    @GetMapping(value = "/bookmarks/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bookmark> getBookmarkById(@PathVariable("id") int id) {

        System.out.println("Fetching bookmark with id " + id);

        Bookmark bookmark = BookmarkController.findByID(id);
        if (bookmark == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bookmark, HttpStatus.OK);
    }

    @GetMapping(path = "/bookmarks", produces = "application/json")
    public List<Bookmark> getAllBookmarks() {
        return bookmarkController.getAll();
    }

    @PostMapping(path = "/bookmarks", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> addBookmark(@RequestBody Bookmark bookmark, UriComponentsBuilder ucBuilder) {

        BookmarkController.create(bookmark);
        HttpHeaders headers = new HttpHeaders();

        headers.setLocation(ucBuilder.path("/bookmarks/{id}").buildAndExpand(bookmark.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

}
