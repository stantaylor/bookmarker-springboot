package com.stantaylor.bookmark;

import com.stantaylor.bookmark.model.Bookmark;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookmarkController {

  @RequestMapping("/bookmark")
  public Bookmark bookmark() {
      return new Bookmark("This is hte title", "https://www.google.com");
  }
}