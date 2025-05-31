package com.Hcm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class abstractpageclass   {
    WebDriver  driver;
    public abstractpageclass(WebDriver driver) {
        this.driver = driver;
    }



}
