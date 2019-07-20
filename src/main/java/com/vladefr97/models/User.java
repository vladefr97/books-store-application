package com.vladefr97.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fio")
    private String fio;



    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    public User() {
    }

    public User(String fio, String login, String password) {
        this.fio = fio;
        this.login = login;
        this.password = password;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return this.id;
    }
}
