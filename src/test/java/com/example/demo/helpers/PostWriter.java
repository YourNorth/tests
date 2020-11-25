package com.example.demo.helpers;

import com.example.demo.DiaryTest;
import com.example.demo.PostGenerator;
import com.example.demo.model.Post;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PostWriter {

    public static  void write(Post post){
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File(DiaryTest.WIN_GENERATOR_FILE_PATH);
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.append(mapper.writeValueAsString(post));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRandom(){
        write(PostGenerator.generateRandom());
    }

    public static void main(String[] args) {
        writeRandom();
    }
}
