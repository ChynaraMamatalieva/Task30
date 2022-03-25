package com.company.service.impl;

import com.company.MyException;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao(new ArrayList<>());

    public UserServiceImpl() {

    }


    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);

    }

    @Override
    public Optional<User> findById(int id) {
        try {
            return userDao.getUsers().stream().filter(x -> x.getId() == id).findFirst();
        } catch (MyException e) {
            System.err.println("No such an id");
            return Optional.empty();
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            Optional<User> user = userDao.getUsers().stream().filter(x -> x.getId() == id).findFirst();
            if (user.isEmpty()) {
                throw new MyException();
            } else {
                userDao.getUsers().removeIf(x -> x.getId() == id);
            }
        } catch (MyException e) {
            System.out.println("can't find such an id");
        }
    }

    @Override
    public List<User> getAll() {
        return userDao.getUsers();
    }
}
