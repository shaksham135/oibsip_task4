package com.yourcompany.ui;

import com.yourcompany.services.AuthenticationService;

import java.util.Scanner;

public class LoginUI {
    private AuthenticationService authService;
    private boolean isLoggedIn;

    public LoginUI() {
        this.authService = new AuthenticationService();
        this.isLoggedIn = false;
    }

    public void displayLoginScreen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Login ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        // Check credentials with the authentication service
        if (authService.authenticate(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            isLoggedIn = true;
            displayMainMenu();
        } else {
            System.out.println("Login failed. Invalid username or password.");
            // Add code to handle failed login attempt
        }
    }

    private void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (isLoggedIn) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Start Exam");
            System.out.println("2. Update Profile");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    startExam();
                    break;
                case 2:
                    updateProfile();
                    break;
                case 3:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void startExam() {
        if (isLoggedIn) {
            System.out.println("Starting exam...");
            displayExamQuestions();
        } else {
            System.out.println("You need to log in first.");
        }
    }

    private void displayExamQuestions() {
        // Define exam questions
        String[] questions = {
                "What is the capital of France?",
                "Who wrote 'Romeo and Juliet'?",
                "What is the chemical symbol for water?"
        };

        // Define options for each question
        String[][] options = {
                {"A. Paris", "B. London", "C. Rome", "D. Berlin"},
                {"A. William Shakespeare", "B. Charles Dickens", "C. Jane Austen", "D. J.K. Rowling"},
                {"A. H", "B. O", "C. W", "D. H2O"}
        };

        // Define correct answers
        int[] correctAnswers = {1, 1, 4};

        // Display questions and prompt for answers
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
    }

    private void updateProfile() {
        // Placeholder method for updating profile
        if (isLoggedIn) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== Update Profile ===");
            System.out.print("Enter new username: ");
            String newUsername = scanner.nextLine().trim();
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine().trim();
            // Here you can update the profile using the new username and password
            System.out.println("Profile updated successfully.");
        } else {
            System.out.println("You need to log in first.");
        }


    }

    private void logout() {
        isLoggedIn = false;
        System.out.println("Logged out successfully.");
    }

    public static void main(String[] args) {
        LoginUI loginUI = new LoginUI();
        loginUI.displayLoginScreen();
    }
}
