package com.teamproject.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private long id;
    private String name;
    private String lastName;
    private String username;
    private String password;
}
