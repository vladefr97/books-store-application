package com.vladefr97.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Class representing Book entity
 */
@Entity
@Table(name = "book")
public class Book {

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public Book(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public Book(String title, Date date, User user) {
        this.title = title;
        this.date = date;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
