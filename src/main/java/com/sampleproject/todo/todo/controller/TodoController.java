package com.sampleproject.todo.todo.controller;

import com.sampleproject.todo.todo.model.Todo;
import com.sampleproject.todo.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping("/get")
    public List<Todo> getAllTodos(){
        return service.findAllTodo();
    }

    @PostMapping("/post")
    public String saveAllTodo(@RequestBody Todo todo){
        return service.saveTodo(todo);
    }

    @GetMapping("/test")
    public String HelloTest(){
        return "hello ashan";
    }


}
