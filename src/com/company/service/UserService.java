package com.company.service;

import com.company.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);
    Optional<User> findById(int id);
    void deleteById(int id);
    List<User> getAll();
}



