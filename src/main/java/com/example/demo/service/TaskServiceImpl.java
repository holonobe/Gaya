package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.todo.TaskForm;
import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository repository;

	@Override
	public List<Task> findAll() {

//		LocalDateTime dt = LocalDateTime.now();
//		List<Task> list = new ArrayList<Task>();
//		Task task = new Task();
//		task.setId(0);
//		task.setContents("test");
//		task.setDeadline(dt);
//		list.add(task);
//		Task task2 = new Task();
//		task2.setId(1);
//		task2.setContents("test1");
//		task2.setDeadline(dt);
//		list.add(task2);

		List<Task> list = repository.findAll();

		return list;
	}

	@Override
	public void insert(TaskForm taskForm) {

		int result = repository.insert(taskForm);

		if (result == 0) {
			throw new RuntimeException("作成失敗");
		}
	}

}
