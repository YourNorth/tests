package com.example.demo.helpers;

import com.example.demo.model.Post;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostHelper extends HelperBase {
    public void addPost(WebDriver driver, Post post) {
        driver.findElement(By.id("DiText")).click();
        driver.findElement(By.id("DiText")).sendKeys(post.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("btn_save")).click();
    }
}
