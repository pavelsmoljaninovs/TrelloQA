package pageObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

        public void openPage(){
        driver.get("https://trello.com/");
        }


        private WebElement getEmail(){
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("[//input[@id='user']")));
            return driver.findElement(By.xpath("//input[@id='user']"));
        }

        private WebElement getPassword(){
            return driver.findElement(By.xpath("//input[@id='password']"));
        }

        private WebElement getLoginButtonOne(){
            return driver.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
        }

        private WebElement getLoginButtonTwo(){
            return driver.findElement(By.xpath("//input[@id='login']"));
        }


    }






