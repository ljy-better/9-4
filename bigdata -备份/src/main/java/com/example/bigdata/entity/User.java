package com.example.bigdata.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_bigdata_user")
@Entity
@Data
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;


    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public User() {
    }
}
