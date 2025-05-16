package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.Model.Todo;
import com.todo.Service.TodoService;

@CrossOrigin(origins = "http://localhost:3000") // React origin
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> getAll() {
        return service.getAllTodos();
    }

    @PostMapping
    public Todo add(@RequestBody Todo todo) {
        return service.addTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteTodo(id);
    }

    @PutMapping
    public Todo update(@RequestBody Todo todo) {
        return service.updateTodo(todo);
    }
}