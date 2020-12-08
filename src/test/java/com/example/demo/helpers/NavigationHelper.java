package com.example.demo.helpers;

import lombok.AllArgsConstructor;
import org.openqa.selenium.Dimension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.WebDriver;


@AllArgsConstructor
public class NavigationHelper extends HelperBase {

    private String url;

    public void openHomePage(WebDriver driver) {

        driver.get(url);
        driver.manage().window().setSize(new Dimension(1050, 724));
    }
}
