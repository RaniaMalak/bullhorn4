package com.example.bullhorn4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Date;


@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3)
    private String content;

     @NotNull
    @Size(min=5)
    private String postdate;

    @NotNull
    @Size(min=3)
    private String sentby;

    private String picture;



    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPostdate() {
        return postdate;
    }

    public String getSentby() {
        return sentby;
    }

    public String getPicture() {
        return picture;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}



