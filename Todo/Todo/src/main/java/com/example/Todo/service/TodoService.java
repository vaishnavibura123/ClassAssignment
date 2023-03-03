package com.example.Todo.service;

import com.example.Todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<Todo> todo=new ArrayList<>();
    public void addTodo(Todo todo1) {
        todo.add(todo1) ;
    }

    public List<Todo> findAll() {
        return todo;

    }

    public Todo findById(int id) {
        for(int i=0; i<todo.size(); i++ ){
            Todo t=todo.get(i) ;
            if(id==t.getId()){
                return t;
            }
        }
        return null;
    }

    public void deleteTodo(int id) {
        for (int i = 0; i < todo.size(); i++) {
            Todo t = todo.get(i);
            if (id == t.getId()) {
                todo.remove(t);
            }
        }
    }

    public void updateTodo(int id, Todo todo1) {
        Todo t=findById(id);
        t.setStatus(todo1.getStatus());
        t.setTitle(todo1.getTitle());
        todo.add(t);
        }
}
