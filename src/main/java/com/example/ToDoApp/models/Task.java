package com.example.ToDoApp.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
//@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean completed;

//    public long getId() {
//        return id;
//    }
//
//    public void setCompleted(boolean completed) {
//        this.completed = completed;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public boolean isCompleted() {
//        return completed;
//    }
//
//    public String getTitle() {
//        return title;
//    }
}
