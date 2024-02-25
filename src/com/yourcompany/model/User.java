package com.yourcompany.model;

public class User {
    private String username;
    private String password;
    // Other user attributes like name, email, etc.

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for attributes
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
