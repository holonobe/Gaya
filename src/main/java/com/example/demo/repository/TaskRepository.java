package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Task;

@Repository
public interface TaskRepository{

	List<Task> findAll();

//	Optional<Task> findById(int id);
//
//	void insert(Task task);
//
//	int update(Task task);
//
//	int deleteById(int id);
//
//	List<Task> findByType(int typeId);

}