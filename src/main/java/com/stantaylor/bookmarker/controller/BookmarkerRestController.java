package com.stantaylor.bookmarker.controller;


import com.stantaylor.bookmarker.model.Bookmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/bookmarks")
public class BookmarkerRestController {

    @Autowired
    private BookmarkController bookmarkController;

    @GetMapping(path="/", produces = "application/json")
    public List<Bookmark> getAllBookmarks() {
        return bookmarkController.getAll();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addBookmark(@RequestBody Bookmark bookmark) {
        BookmarkController.create(bookmark);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bookmark.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
//    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee)
//    {
//        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
//        employee.setId(id);
//
//        employeeDao.addEmployee(employee);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(employee.getId())
//                .toUri();
//
//        return ResponseEntity.created(location).build();
//    }
}
