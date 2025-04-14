package com.karteikarten.karteikarten;

public class Card {
    private Long id;
    private String question;
    private String answer;
    private String category;
    private int correctCount;

    public Card(Long id, String question, String answer, String category, int correctCount) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.correctCount = correctCount;
    }

    public Long getId() { return id; }
    public String getQuestion() { return question; }
    public String getAnswer() { return answer; }
    public String getCategory() { return category; }
    public int getCorrectCount() { return correctCount; }
}