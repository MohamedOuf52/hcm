package com.Hcm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpagehcm extends abstractpageclass {

   private final By username = By.id("loginForm:userNameId");
    private final  By password = By.id("loginForm:passwordId");
    private final  By loginButton = By.id("loginForm:loginBtnId");

    public loginpagehcm(WebDriver driver) {
        super(driver);
    }
    public void navigateToLoginPage(){
        driver.get("http://172.16.101.18:8032/HCM/Main/Login.jsf");



    }
    public void login (String userName, String passWord) {
        driver.findElement(username).sendKeys(userName);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(loginButton).click();
    }


}
