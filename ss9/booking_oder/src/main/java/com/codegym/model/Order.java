package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    private long code;

    @ManyToMany(mappedBy = "orderSet")
    private Set<Book> book;

    public Order() {
    }

    public Order(int idOrder, long code, Set<Book> book) {
        this.idOrder = idOrder;
        this.code = code;
        this.book = book;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
