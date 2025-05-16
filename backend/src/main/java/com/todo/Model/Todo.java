package com.todo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed;

    // Constructors
    public Todo() {}
    public Todo(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
