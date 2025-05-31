package pageopjectmodeltests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class abstracttestclass {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Navigate to the HCM login page
        ; // Replace with actual URL
    }
    @AfterMethod
    public void TearDown() {
        // Close the browser
        driver.quit();
    }
}
