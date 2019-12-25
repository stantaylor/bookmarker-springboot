package com.stantaylor.bookmarker.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bookmark", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Bookmark {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
    private int id;

    @Column(name="title", length=255, nullable=false)
    private String title;

    @Column(name="url", length=255, nullable=false)
    private String url;

    @Column(name="insert_time", nullable=false)
    private Date insert_time;

    public Bookmark() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public Date getInsertTime() {
        return insert_time;
    }
    public void setInsertTime(Date insert_time) {
        this.insert_time = insert_time;
    }

}