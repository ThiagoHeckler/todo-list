package com.example.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todolist.model.Task;
import com.example.todolist.repository.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository repository;
	
	public TaskService(TaskRepository repository) {
		this.repository = repository;
	}
	
	public List<Task> getAllTasks() {
		return repository.findAll();
	}
	
	public Task createTask(Task task) {
		return repository.save(task);
	}
	
	public void deleteTask(Long id) {
		repository.deleteById(id);
	}
	
	
}
