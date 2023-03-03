package com.example.Todo.controller;

import com.example.Todo.model.Todo;
import com.example.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Todo")
public class TodoController {
    @Autowired
    TodoService todoService;
    @PostMapping("/add")
    public void addTodo(@PathVariable Todo todo){
        todoService.addTodo(todo);
    }
    @GetMapping("/findAll")
    public List<Todo> findAll(){
        return todoService.findAll();
    }
    @GetMapping("/findById/{id}")
    public Todo findById(@PathVariable int id){
        return todoService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
    }
    @PutMapping("/update/{id}")
    public void updateTodo(@PathVariable int id, @RequestBody Todo todo){
        todoService.updateTodo(id,todo);
    }

}
