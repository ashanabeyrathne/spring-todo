package com.sampleproject.todo.todo.service;

import com.sampleproject.todo.todo.model.Todo;
import com.sampleproject.todo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAllTodo(){
        return todoRepository.findAll();
    }

    public String saveTodo(Todo todo){
        todoRepository.save(todo);
        return "Todo with id" + todo.getId() + " saved";
    }
}
