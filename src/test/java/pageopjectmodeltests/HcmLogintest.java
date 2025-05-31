package pageopjectmodeltests;

import com.Hcm.loginpagehcm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HcmLogintest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Navigate to the HCM login page
       ; // Replace with actual URL
    }

    @Test

    public void TestLoginPage() {
        loginpagehcm login = new loginpagehcm(driver);
        login.navigateToLoginPage();
        String validusername = "1000036469";
        String validpassword = "E!j@d@2020";
        login.login(validusername, validpassword);

       By mainpage = By.xpath("//h3[@class=\"textlogo-inner\"]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(mainpage));
        driver.findElement(mainpage).isDisplayed();    }

    @AfterMethod
    public void TearDown() {
        // Close the browser
        driver.quit();
    }
}

