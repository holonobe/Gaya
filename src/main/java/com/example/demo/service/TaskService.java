package com.example.demo.service;

import java.util.List;

import com.example.demo.app.todo.TaskForm;
import com.example.demo.entity.Task;

public interface TaskService {

	List<Task> findAll();

//	Optional<Task> getTask(int id);
//
	void insert(TaskForm taskForm);
//
//	void update(Task task);
//
//	void deleteById(int id);
//
//	List<Task> findByType(int typeId);

}
