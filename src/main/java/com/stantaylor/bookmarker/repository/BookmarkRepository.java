package com.stantaylor.bookmarker.repository;

import com.stantaylor.bookmarker.model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}