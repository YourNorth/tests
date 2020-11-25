package com.example.demo.helpers;

import com.example.demo.model.Post;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PostReader {

    public static Post read(){
        Post res = null;
        File file = new File("/home/melok/Documents/test.txt");
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            res = objectMapper.readValue(file, Post.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(read());
    }
}
