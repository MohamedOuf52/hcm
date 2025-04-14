package pageopjectmodeltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void login() {
        WebDriver driver;
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        By username= By.id("user-name");
        By password= By.id("password") ;
        By loginButton = By.id("login-button") ;
        String validusername = "standard_user";
        String validpassword = "secret_sauce";
        driver.findElement(By.id("user-name")).sendKeys(validusername);
        driver.findElement(By.id("password")).sendKeys(validpassword);
        driver.findElement(By.id("login-button")).click();
// product page
        By product_label= By.xpath("//div[@class='product_label']");
       var displayed = driver.findElement(product_label).isDisplayed();
        boolean isDisplayed = true;
        Assert.assertTrue(isDisplayed , "product_label is not displayed");
        //quite driver
        driver.quit();






    }
}
