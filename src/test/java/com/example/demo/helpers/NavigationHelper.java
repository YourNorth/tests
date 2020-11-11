package com.example.demo.helpers;

import org.openqa.selenium.Dimension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {


    public void openHomePage(WebDriver driver) {

        driver.get("https://diary.anek.ws/");
        driver.manage().window().setSize(new Dimension(1050, 724));
    }
}
