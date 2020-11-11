package com.example.demo.model;

import lombok.Data;

@Data
public class User{
    private String nickname;
    private String password;

    public User(String nickname, String password){
        this.nickname = nickname;
        this.password = password;


    }
}
