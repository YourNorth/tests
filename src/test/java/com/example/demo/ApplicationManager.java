package com.example.demo;

import com.example.demo.helpers.LoginHelper;
import com.example.demo.helpers.LogoutHelper;
import com.example.demo.helpers.NavigationHelper;
import com.example.demo.helpers.PostHelper;
import com.example.demo.model.Post;
import com.example.demo.model.User;
import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

@Data
public class ApplicationManager {

    private static ApplicationManager app;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    private WebDriver driver;
    private String baseUrl;

    private NavigationHelper navigationHelper;
    private LoginHelper loginHelper;
    private PostHelper postHelper;
    private LogoutHelper logoutHelper;


    private User user;
    private Post post1;
    private Post post2;

    public ApplicationManager(){
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        navigationHelper = new NavigationHelper();
        loginHelper = new LoginHelper();
        postHelper = new PostHelper();
        logoutHelper = new LogoutHelper();
        user = new User("Andrey228", "qwerty007");
        post1 = new Post("3е задание");
        post2 = new Post("3е задание++");
    }

    public static ApplicationManager getInstance() {

        if (app==null)

        {

            ApplicationManager newInstance = new ApplicationManager();

            newInstance.navigationHelper.openHomePage(newInstance.getDriver());

            app = newInstance;

        }

        return app;
    }
}
