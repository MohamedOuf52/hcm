package pageopjectmodeltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HcmLogin {
    @Test

   public void testloginpage() {
        WebDriver driver;
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        driver.get("http://172.16.101.18:8032/HCM/Main/Login.jsf");
        By username= By.id("loginForm:userNameId");
        By password= By.id("loginForm:passwordId") ;
        By loginButton = By.id("loginForm:loginBtnId") ;
        String validusername = "1000036469";
        String validpassword = "E!j@d@2020";
        driver.findElement(By.id("loginForm:userNameId")).sendKeys("1000036469");
        driver.findElement(By.id("loginForm:passwordId")).sendKeys("E!j@d@2020");
        driver.findElement(By.id("loginForm:loginBtnId")).click();
    }
}
