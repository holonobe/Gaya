package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

/*
 * This is completed in Easy mode. If you want to practice, please delete this file.
 */
@Data
public class Task {
	private int id;
	private String contents;
	private LocalDateTime deadline;

}
