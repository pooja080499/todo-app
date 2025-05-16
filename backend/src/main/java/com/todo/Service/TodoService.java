package com.todo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.Model.Todo;
import com.todo.Repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;

    public List<Todo> getAllTodos() {
        return repo.findAll();
    }

    public Todo addTodo(Todo todo) {
        return repo.save(todo);
    }

    public void deleteTodo(Long id) {
        repo.deleteById(id);
    }

    public Todo updateTodo(Todo todo) {
        return repo.save(todo);
    }
}