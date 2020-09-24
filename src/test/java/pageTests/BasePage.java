package pageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    protected WebDriver driver;
    protected String username;
    protected String password;


    @BeforeMethod
    public void start() {

        System.out.println("Test Start");
    }

        @AfterMethod
        public void finish(){

        System.out.println("Test Finish");

            driver.quit();
        }

}
