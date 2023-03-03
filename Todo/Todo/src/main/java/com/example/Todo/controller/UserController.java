package com.example.Todo.controller;

import com.example.Todo.model.User;
import com.example.Todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public  void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping("/findAll")
    public List<User> findAl(){
      return userService.findAll();
    }
    @GetMapping("/findById/{userId}")
    public User findById(@PathVariable int userId){
        return userService.findById(userId);
    }
    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }
    @PutMapping("/update/{userId}")
    public void updateUser(@PathVariable int userId, @RequestBody User user){
        userService.updateUser(userId,user);
    }

}
