package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    WebDriver driver ;
    public login(WebDriver driver) {
        this.driver = driver;
    }
    public void NavigateToLoginPage() {
        driver.get("https://www.saucedemo.com/v1/");
    }
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

}
