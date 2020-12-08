package com.example.demo.helpers;

import com.example.demo.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class LoginHelper extends HelperBase {
    private String nicknameField = "Nik";
    private String passwordField = "Password";

    public boolean isLoggedIn(WebDriver driver)
    {
        try{
            driver.findElement(By.id("login_subm"));
        } catch (Exception e){
            System.out.println("\n=\n=\n=\n=\n=\n=\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(Arrays.toString(e.getStackTrace()));
            return true;
        }
        return false;
    }

    public Boolean isLoggedIn(WebDriver driver, User user)
    {
        try{
            if(driver.findElement(By.id("author")).getText().equals(user.getNickname())){
              return true;
            }
            else {
                return false;
            }
        } catch (Exception e){
            System.out.println("\n=\n=\n=\n=\n=\n=\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(Arrays.toString(e.getStackTrace()));
            return null;
        }
    }

    public void smartLogin(WebDriver driver, User user) {
        if (isLoggedIn(driver, user)==null){
            login(driver, user);
        } else {
            if(!isLoggedIn(driver, user)){
                new LogoutHelper().logout(driver);
                login(driver, user);
            }
        }
    }

    public void login(WebDriver driver, User user) {
            driver.findElement(By.id(nicknameField)).click();
            driver.findElement(By.id(nicknameField)).sendKeys(user.getNickname());
            driver.findElement(By.id(passwordField)).click();
            driver.findElement(By.id(passwordField)).sendKeys(user.getPassword());
            driver.findElement(By.id("remem_lbl")).click();
            driver.findElement(By.id("login_subm")).click();
    }
}
