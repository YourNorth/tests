package com.example.demo;
// Generated by Selenium IDE

import com.example.demo.helpers.LoginHelper;
import com.example.demo.model.User;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileWriter;

public class DiaryTest {
    private static ApplicationManager appManager;
    private static final String LINUX_GECKODRIVER_PATH = "/home/melok/Downloads/geckodriver";
    private static final String WIN_GECKODRIVER_PATH = "C:\\Users\\User\\Downloads\\oneMoreDirectory\\geckodriver.exe";
    public static final String WIN_GENERATOR_FILE_PATH = "C:\\Users\\User\\Documents\\generator_file.txt";
    public static final String WIN_SETTING_FILE_PATH = "C:\\Users\\User\\Documents\\setting_file.txt";
    public static final String LIN_GENERATOR_FILE_PATH = "./resources/generator_file.txt";

    public DiaryTest() {
        System.setProperty("webdriver.gecko.driver", WIN_GECKODRIVER_PATH);
    }

    @Before
    public void setUp() {
        appManager = ApplicationManager.getInstance();
    }

    @AfterClass
    public static void tearDown() {
        appManager.getDriver().quit();
    }

    @Test
    public void LoginWithValidData1() {
        AuthBase authBase = new AuthBase();
/*
        appManager.getNavigationHelper().openHomePage(appManager.getDriver());
*/
        appManager.getLoginHelper().smartLogin(appManager.getDriver(), new User("Andrey227", "qwerty007"));
        appManager.getPostHelper().addPost(appManager.getDriver(), appManager.getPost2());
        System.out.println("=======\n===============\n==============\n============" +
                appManager.getDriver().findElement(By.className("dt")).getText());
        Assert.assertEquals(appManager.getPost2().getText(), appManager.getDriver().findElement(By.className("dt")).getText());
    }

    @Test
    public void LoginWithValidData2() {
        AuthBase authBase = new AuthBase();
        /*appManager.getNavigationHelper().openHomePage(appManager.getDriver());*/
        appManager.getLoginHelper().smartLogin(appManager.getDriver(), appManager.getUser());
        appManager.getPostHelper().addPost(appManager.getDriver(), appManager.getPost1());

        System.out.println("=======\n===============\n==============\n============" +
                appManager.getDriver().findElement(By.className("dt")).getText());
        Assert.assertEquals(appManager.getPost1().getText(), appManager.getDriver().findElement(By.className("dt")).getText());
    }

    @Test
    public void LoginWithInvalidData1() {
        try {
            AuthBase authBase = new AuthBase();
            /*appManager.getNavigationHelper().openHomePage(appManager.getDriver());*/
            appManager.getLoginHelper().smartLogin(appManager.getDriver(), new User("wsedewfwefwefwefwefweffw", "wefwefwef"));
            appManager.getPostHelper().addPost(appManager.getDriver(), appManager.getPost2());
            System.out.println("=======\n===============\n==============\n============" +
                    appManager.getDriver().findElement(By.className("dt")).getText());
            Assert.assertEquals(appManager.getPost2().getText(), appManager.getDriver().findElement(By.className("dt")).getText());
        } catch (Exception e) {
            Assert.assertTrue(!appManager.getLoginHelper().isLoggedIn(appManager.getDriver()));
        }
    }
}

