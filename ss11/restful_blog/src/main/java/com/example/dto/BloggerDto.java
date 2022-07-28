package com.example.dto;

import java.util.Date;

public class BloggerDto {
    private int id;
    private String name;
    private String content;
    private String status;
    private Date dayStart;

    public BloggerDto() {
    }

    public BloggerDto(int id, String name, String content, String status, Date dayStart) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.status = status;
        this.dayStart = dayStart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }
}
