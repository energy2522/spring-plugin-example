package com.example.spring.plugin.model;

public class UserInfo {
    private final String id;
    private final String firstname;
    private final String lastname;

    public UserInfo(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
