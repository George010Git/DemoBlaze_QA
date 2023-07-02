package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class PlaceOrderPage {

    WebDriver driver;

    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeTheOrderForm() {
        driver.findElement(By.cssSelector("#name")).sendKeys(Constants.NAME);
        driver.findElement(By.cssSelector("#country")).sendKeys(Constants.COUNTRY);
        driver.findElement(By.cssSelector("#city")).sendKeys(Constants.CITY);
        driver.findElement(By.cssSelector("#card")).sendKeys(Constants.CREDIT_CARD);
        driver.findElement(By.cssSelector("#month")).sendKeys(Constants.MONTH_EXPIRATION);
        driver.findElement(By.cssSelector("#year")).sendKeys(Constants.YEAR_EXPIRATION);
    }

    public String checkOrderForm() {
        return driver.findElement(By.cssSelector("#orderModalLabel")).getText();
    }

    public void clickPurchaseOrderButton() {
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
    }
}
