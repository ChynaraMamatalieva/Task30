package com.company.service.impl;

import com.company.MyException;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private  UserDao user;

    public UserServiceImpl(UserDao user) {
        this.user = user;
    }

    public UserDao getUser() {
        return user;
    }



    @Override
    public void userdiKoshu(List<User> list,User user) {
        list.add(user);
    }

    @Override
    public void idMenenTabuu(List<User> list, int id) {
        try {
            for (User user1 : list) {
                if (user1.getId() != id) {
                    throw new MyException("no such id ");
                } else if (user1.getId() == id) {
                    System.out.println(user1);
                }
            }
        } catch (MyException e){
            System.err.println(e.getMessage());
        }
//        for(User u: list){
//            if(u.getId() == id){
//                System.out.println(u);
//            }
//        }
        list.stream().filter(x -> x.getId() == id).forEach(System.out::println);
    }

    private boolean user(int id) {
        return false;
    }

    @Override
    public void idMenenOchuruu(List<User> list, int id) {
        list.removeIf(user1 -> user1.getId() == id);

    }

    @Override
    public void bardykUserlerdiAluu(List<User> list) {
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
}
