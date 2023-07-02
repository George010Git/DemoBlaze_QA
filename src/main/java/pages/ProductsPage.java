package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkIfTheProductIsDisplayed() {

        return driver.findElement(By.xpath("(//td[contains(text(),'Samsung galaxy s6')])")).getText();
    }

    public void placeOrder() {
        driver.findElement(By.xpath("(//button[contains(text(),'Place Order')])")).click();
    }
}
