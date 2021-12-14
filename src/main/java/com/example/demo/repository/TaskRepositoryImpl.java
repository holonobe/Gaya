package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Task;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

	private final JdbcTemplate jdbcTemplate;

	public TaskRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Task> findAll() {

		String sql = "SELECT * FROM task";

		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

		List<Task> list = new ArrayList<Task>();

		for (Map<String, Object> result : resultList) {

			Task task = new Task();
			task.setId((int) result.get("id"));
			task.setContents((String) result.get("contents"));
			task.setDeadline( (LocalDateTime) result.get("deadline"));

			list.add(task);
		}
		return list;

	}

}
