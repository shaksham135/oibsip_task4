package com.yourcompany.model;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Question> questions;

    public Exam() {
        this.questions = new ArrayList<>();
        // Populate exam with questions
        populateQuestions();
    }

    // Method to add questions to the exam
    private void populateQuestions() {
        // Add questions here
        String[] options1 = {"1", "4", "8", "2"};
        Question question1 = new Question("What is 2+2?", options1, 1);
        questions.add(question1);

        String[] options2 = {"True", "False"};
        Question question2 = new Question("Is Java a programming language?", options2, 0);
        questions.add(question2);

        // Add more questions as needed
    }

    // Getters and setters for attributes
    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
