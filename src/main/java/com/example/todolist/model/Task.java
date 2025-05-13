package com.example.todolist.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String description;
	private boolean completed;
	private LocalDateTime createdAt;
	
	@PrePersist
	public void onCreate() {
		createdAt = LocalDateTime.now();
	}
}
