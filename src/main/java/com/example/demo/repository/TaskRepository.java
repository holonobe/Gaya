package com.example.demo.repository;

import java.util.List;

import com.example.demo.app.todo.TaskForm;
import com.example.demo.entity.Task;

public interface TaskRepository{

	List<Task> findAll();

	int insert(TaskForm taskForm);

}