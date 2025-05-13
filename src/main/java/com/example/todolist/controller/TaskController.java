package com.example.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	private final TaskService service;
	
	public TaskController(TaskService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Task> getAll() {
		return service.getAllTasks();
	}
	
	@PostMapping
	public Task create(@RequestBody Task task) {
		return service.createTask(task);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteTask(id);
	}
	
	
}
