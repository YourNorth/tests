package com.example.demo.helpers;

import com.example.demo.DiaryTest;
import com.example.demo.model.Setting;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SettingReader {
    public static Setting read(){
        Setting res = null;
        File file = new File(DiaryTest.WIN_SETTING_FILE_PATH);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            res = objectMapper.readValue(file, Setting.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(read());
    }
}
