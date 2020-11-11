package com.example.demo.helpers;

import com.example.demo.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends HelperBase {
    private String nicknameField = "Nik";
    private String passwordField = "Password";

    public void login(WebDriver driver, User user) {
        driver.findElement(By.id(nicknameField)).click();
        driver.findElement(By.id(nicknameField)).sendKeys(user.getNickname());
        driver.findElement(By.id(passwordField)).click();
        driver.findElement(By.id(passwordField)).sendKeys(user.getPassword());
        driver.findElement(By.id("remem_lbl")).click();
        driver.findElement(By.id("login_subm")).click();
    }
}
