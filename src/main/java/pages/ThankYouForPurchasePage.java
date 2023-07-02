package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouForPurchasePage {
    WebDriver driver;

    public ThankYouForPurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkThankYouForPurchase() {
        return driver.findElement(By.xpath("(//h2[contains(text(),'Thank you for your purchase!')])")).getText();
    }

    public void clickOkButton() {
        driver.findElement(By.xpath("//div[@class='sa-button-container']")).click();
    }
}
