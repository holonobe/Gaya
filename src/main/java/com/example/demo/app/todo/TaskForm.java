package com.example.demo.app.todo;

import java.time.LocalDateTime;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TaskForm {

    @NotBlank (message = "タスクを入力してください。")
    private String contents;

    @NotNull (message = "期限を設定してください。")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") //formatするための記述
    @Future (message = "期限が過去に設定されています。")
    private LocalDateTime deadline;

}