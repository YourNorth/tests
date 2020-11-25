package com.example.demo.helpers;

import com.example.demo.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutHelper extends HelperBase {
    public void logout(WebDriver driver){
        driver.findElement(By.linkText("Выйти")).click();
    }
}
