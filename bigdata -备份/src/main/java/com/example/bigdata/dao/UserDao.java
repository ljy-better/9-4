package com.example.bigdata.dao;

import com.example.bigdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {


    List<User> findByAge(int age);

   // User findById(int id);
}
