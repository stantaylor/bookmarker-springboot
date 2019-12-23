package com.stantaylor.bookmarker;

import com.stantaylor.bookmarker.controller.BookmarkController;
import com.stantaylor.bookmarker.model.Bookmark;
import com.stantaylor.bookmarker.view.BookmarkView;
import org.apache.commons.lang3.RandomStringUtils;

public class Application {

  public static void main(String[] args) {

      String snippet = RandomStringUtils.randomAlphabetic(10);
      Bookmark model = new Bookmark(snippet, "https://www." + snippet + ".com");

      BookmarkView view = new BookmarkView();

      BookmarkController controller = new BookmarkController(model, view);

      controller.updateView();

  }
}
