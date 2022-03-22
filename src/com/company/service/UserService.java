package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {

    void userdiKoshu(List<User> list, User user);
    void idMenenTabuu(List<User> list, int id);
    void idMenenOchuruu(List<User> list, int id);
    void bardykUserlerdiAluu(List<User> list);
}
