package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithValidCredentials() throws InterruptedException {


        driver.findElement(By.cssSelector("#login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#loginusername")).sendKeys(Constants.LOGIN_EMAIL);
        driver.findElement(By.cssSelector("#loginpassword")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
    }

    public void clickSamsungItem() {
        driver.findElement(By.xpath("(//a[contains(text(),'Samsung galaxy s6')])")).click();
    }

    public void registerUser() {
        driver.findElement(By.cssSelector("#signin2")).click();
    }
}
