package pageopjectmodeltests;

import com.saucedemo.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginsaucedemo {
    WebDriver driver;

    @Test
    public void login() {
       //opject creation
        login login = new login(driver);
        //navigate to login page
        login.NavigateToLoginPage();

        //login page

        String validusername = "standard_user";
        String validpassword = "secret_sauce";
        driver.findElement(By.id("user-name")).sendKeys(validusername);
        driver.findElement(By.id("password")).sendKeys(validpassword);
        driver.findElement(By.id("login-button")).click();

// product page
        By product_label = By.xpath("//div[@class='product_label']");
        var displayed = driver.findElement(product_label).isDisplayed();
        boolean isDisplayed = true;
        Assert.assertTrue(isDisplayed, "product_label is not displayed");
    }

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void TearDown() {
        driver.quit();
    }

}
