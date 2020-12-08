package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User{
    private String nickname;
    private String password;

    public User(String nickname, String password){
        this.nickname = nickname;
        this.password = password;


    }
}
