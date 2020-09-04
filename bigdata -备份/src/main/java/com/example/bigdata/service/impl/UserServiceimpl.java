package com.example.bigdata.service.impl;

import com.example.bigdata.dao.UserDao;
import com.example.bigdata.entity.User;
import com.example.bigdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryByage(int age){
        return userDao.findByAge(age);
    }
    @Override
    public User save(User user){
        return userDao.save(user);
    }
    @Override
    public void deletUserById(int id){
        userDao.deleteById(id);
    }
    @Override
    public Optional<User> queryById(int id){
        return userDao.findById(id);
    }

}
