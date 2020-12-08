package com.example.demo;

public class AuthBase {
    ApplicationManager app;

    public ApplicationManager setupTest(){
        app = ApplicationManager.getInstance();
        app.getNavigationHelper().openHomePage(app.getDriver());
        return app;
    }
}
