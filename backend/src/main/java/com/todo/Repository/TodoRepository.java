package com.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.Model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {}