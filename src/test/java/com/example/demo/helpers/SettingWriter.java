package com.example.demo.helpers;

import com.example.demo.DiaryTest;
import com.example.demo.model.Setting;
import com.example.demo.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SettingWriter {

        public static  void write(Setting setting){
            ObjectMapper mapper = new ObjectMapper();
            try {
                File file = new File(DiaryTest.WIN_SETTING_FILE_PATH);
                FileWriter fileWriter = new FileWriter(file, false);
                fileWriter.append(mapper.writeValueAsString(setting));
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            write(new Setting(new User("Andrey228", "qwerty007"), "https://diary.anek.ws/"));
        }
}
