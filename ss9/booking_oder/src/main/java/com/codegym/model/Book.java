package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;
    private String name;
    private int amount;

    @ManyToMany
    @JoinTable(name = "order_book", joinColumns = @JoinColumn(name = "id_order"), inverseJoinColumns = @JoinColumn(name = "id_book"))
    private Set<Order> orderSet;

    public Book() {
    }

    public Book(int idBook, String name, int amount, Set<Order> orderSet) {
        this.idBook = idBook;
        this.name = name;
        this.amount = amount;
        this.orderSet = orderSet;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}
