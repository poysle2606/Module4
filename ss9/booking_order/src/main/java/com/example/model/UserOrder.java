package com.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long code;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_booking", referencedColumnName = "id")
    private Book book;

    public UserOrder() {
    }

    public UserOrder(int id, long code, Date date, Book book) {
        this.id = id;
        this.code = code;
        this.date = date;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

