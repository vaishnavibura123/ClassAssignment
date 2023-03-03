package com.example.Todo.service;

import com.example.Todo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private static List<User> user=new ArrayList<>();



    public void addUser(User user1){
        user.add(user1);
    }


    public List<User> findAll() {
        return user;

    }

    public User findById(int userId) {
        for(int i=0; i<user.size(); i++){
            User u=user.get(i);
            if(userId==u.getUserId()){
                return u;
            }
        }
        return null;
    }

    public void deleteUser(int userId) {
        for (int i=0; i<user.size(); i++){
            User u=user.get(i);
            if(userId==u.getUserId()){
                user.remove(u);
            }
        }
    }

    public void updateUser(int userId, User user1) {
        User u=findById(userId);
        u.setFirstName(user1.getFirstName());
        u.setLastName(user1.getLastName());
        u.setUserName(user1.getUserName());
        u.setPassword(user1.getPassword());
        u.setEmail(user1.getEmail());
        u.setNumber(user1.getNumber());
        user.add(u);
    }
}
