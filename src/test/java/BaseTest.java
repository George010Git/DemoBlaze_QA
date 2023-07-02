import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.Constants;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }

    @Test
    public void goToWebsiteTest() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
    }

    @Test
    public void goToRegisterTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        BasePage basePage = new BasePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        homePage.registerUser();
        registerPage.signUpForm();
        registerPage.clickSignUpButton();
        basePage.waitSeconds(2);
        String actualMessage = registerPage.getTextAlertBox();
        String expectedMessage = Constants.SING_UP_MESSAGE;
        Assert.assertEquals(actualMessage, expectedMessage);
        registerPage.acceptAlertBox();
    }

    @Test
    public void loginTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        BasePage basePage = new BasePage(driver);

        homePage.loginWithValidCredentials();
        basePage.waitSeconds(1);
        basePage.getActualMessage();
        System.out.println(basePage.getActualMessage());
        Assert.assertTrue(basePage.getActualMessage().contains(Constants.WELCOME));
    }

    @Test
    public void end2endTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        BasePage basePage = new BasePage(driver);
        ProductStorePage productStorePage = new ProductStorePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);
        ThankYouForPurchasePage thankYouForPurchasePage = new ThankYouForPurchasePage(driver);

        homePage.loginWithValidCredentials();
        basePage.waitSeconds(1);
        basePage.getActualMessage();
        System.out.println(basePage.getActualMessage());
        Assert.assertTrue(basePage.getActualMessage().contains(Constants.WELCOME));

        homePage.clickSamsungItem();
        basePage.waitSeconds(1);
        productStorePage.clickAddToCart();
        basePage.waitSeconds(2);

        String actualAlertBoxMessage = basePage.getTextFromAlertBox();
        String expectedAlertBoxMessage = Constants.PRODUCT_ADDED;
        Assert.assertEquals(expectedAlertBoxMessage, actualAlertBoxMessage);
        basePage.acceptAlertBox();
        basePage.waitSeconds(2);
        productStorePage.clickToCart();
        basePage.waitSeconds(2);


        String actualProductsMessage = productsPage.checkIfTheProductIsDisplayed();
        Assert.assertTrue(actualProductsMessage.contains(Constants.ITEM_NAME));

        productsPage.placeOrder();
        placeOrderPage.completeTheOrderForm();
        basePage.waitSeconds(2);

        String actualOrderFormMessage = placeOrderPage.checkOrderForm();
        Assert.assertTrue(actualOrderFormMessage.contains(Constants.ORDER_FORM));

        placeOrderPage.clickPurchaseOrderButton();
        basePage.waitSeconds(2);

        String actualThankYouForPurchaseMessage = thankYouForPurchasePage.checkThankYouForPurchase();
        Assert.assertTrue(actualThankYouForPurchaseMessage.contains(Constants.THANK_YOU_FOR_PURCHASE));

        thankYouForPurchasePage.clickOkButton();
        basePage.waitSeconds(2);

    }

}
