package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductStorePage {
    WebDriver driver;

    public ProductStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart() {

        driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
    }

    public void clickToCart() {

        driver.findElement(By.cssSelector("#cartur")).click();
    }
}
