package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver ;
    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/v1/");
    }
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

}
