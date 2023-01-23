package com.example.firstspringboot.service;


import com.example.firstspringboot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void removeUserById(int id);

    void removeUser(User user);

    void removeAllUsers();

    void update(int id, User user);
}
