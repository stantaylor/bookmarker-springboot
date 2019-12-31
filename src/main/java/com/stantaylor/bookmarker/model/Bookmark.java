package com.stantaylor.bookmarker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="bookmark", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Bookmark extends AuditModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", length=255, nullable=false)
    private String title;

    @Column(name="url", length=255, nullable=false)
    private String url;

    public Bookmark() {
    }

    public Bookmark(String title, String url){
        this.title = title;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setUrl(String u) {
        url = u;
    }

    public String getUrl() {
        return url;
    }

}