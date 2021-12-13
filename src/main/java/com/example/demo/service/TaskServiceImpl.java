package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;

@Service
public class TaskServiceImpl implements TaskService {

//	@Autowired
//	private final TaskRepository repository;

	@Override
	public List<Task> findAll() {

//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
		LocalDateTime dt = LocalDateTime.now();

		List<Task> list = new ArrayList<Task>();
		Task task = new Task();
		task.setId(0);
		task.setContents("test");
		task.setDeadline(dt);
		list.add(task);
		Task task2 = new Task();
		task2.setId(1);
		task2.setContents("test1");
		task2.setDeadline(dt);
		list.add(task2);
		return list;
	}

}
