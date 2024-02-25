package com.yourcompany.services;

public class AuthenticationService {
    // Simulated user database (username, password)
    private final String[][] users = {
            {"admin", "password"},
            {"user1", "pass123"},
            {"user2", "abc456"}
    };

    public boolean authenticate(String username, String password) {
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true; // Authentication successful
            }
        }
        return false; // Authentication failed
    }
}
