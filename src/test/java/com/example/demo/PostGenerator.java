package com.example.demo;

import com.example.demo.model.Post;

public class PostGenerator {

    public static Post generateRandom(){
        return new Post("newPost" + (Math.random()*12345));
    }
}
