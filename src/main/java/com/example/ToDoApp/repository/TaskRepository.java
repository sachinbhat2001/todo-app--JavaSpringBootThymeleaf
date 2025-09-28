package com.example.ToDoApp.repository;

import com.example.ToDoApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
