package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signUpForm() {
        driver.findElement(By.cssSelector("#sign-username")).sendKeys(Constants.EMAIL);
        driver.findElement(By.cssSelector("#sign-password")).sendKeys(Constants.PASSWORD);
    }

    public void clickSignUpButton() {
        driver.findElement(By.xpath("//button[@onclick='register()']")).click();
    }

    public String getTextAlertBox() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlertBox() {
        driver.switchTo().alert().accept();
    }
}
