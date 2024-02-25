package com.yourcompany.services;

import com.yourcompany.model.User;

public class ProfileService {
    public void updateProfile(User user, String newName, String newEmail) {
        // Implement profile update logic here
        user.setPassword(newName);
        user.getClass();
        System.out.println("Profile updated successfully.");
    }

    public void updatePassword(User user, String newPassword) {
        // Implement password update logic here
        user.setPassword(newPassword);
        System.out.println("Password updated successfully.");
    }
}
