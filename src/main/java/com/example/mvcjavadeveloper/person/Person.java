package com.example.mvcjavadeveloper.person;

import java.util.Date;

public class Person {
    public Integer id;
    public String username;
    public String email;

    public boolean enabled; //test
    public Date lastLoginDate;

    public Person(Integer id, String email, String username, boolean enabled, Date lastLoginDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.enabled = enabled;
        this.lastLoginDate = lastLoginDate;
    }
}
