package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitSeconds(int seconds)  {

        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String getActualMessage() {
        return driver.findElement(By.cssSelector("#nameofuser")).getText();
    }

    public String getTextFromAlertBox() {

        return driver.switchTo().alert().getText();
    }

    public void acceptAlertBox() {

        driver.switchTo().alert().accept();
    }

}
