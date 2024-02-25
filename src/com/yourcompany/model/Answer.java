package com.yourcompany.model;

public class Answer {
    private Question question;
    private int selectedOptionIndex;

    public Answer(Question question, int selectedOptionIndex) {
        this.question = question;
        this.selectedOptionIndex = selectedOptionIndex;
    }

    // Getters and setters for attributes
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getSelectedOptionIndex() {
        return selectedOptionIndex;
    }

    public void setSelectedOptionIndex(int selectedOptionIndex) {
        this.selectedOptionIndex = selectedOptionIndex;
    }
}
