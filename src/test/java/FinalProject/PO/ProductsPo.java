package FinalProject.PO;


import org.junit.Assert;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPo {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public ProductsPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
        actions = new Actions(driver);
    }

    @FindBy(id = "ui-id-4")
    WebElement womanList;

    @FindBy(id = "ui-id-9")
    WebElement topsList;

    @FindBy(id = "ui-id-12")
    WebElement hoodiesTShirts;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div")
    WebElement helenaHooded;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/div/div[3]/div/div[1]/form/button/span")
    WebElement addHelenaHoodedToCart;
    @FindBy(id = "option-label-size-143-item-168")
    WebElement sizeM;

    @FindBy(id = "option-label-color-93-item-60")
    WebElement yellowColor;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement helenaAddToCartButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/ul/li[1]/a")
    WebElement goHomePage;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[6]/div/a/span")
    WebElement pushItBag;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[6]/div/div/div[3]/div/div[1]/form/button")
    WebElement addPushItBagToCart;
    public void hoverWomanList() {
        actions.moveToElement(womanList).perform();
    }
    public void hoverTopsList() {
        actions.moveToElement(topsList).perform();
    }

    public void clickHoodiesTShirts() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(hoodiesTShirts));
        hoodiesTShirts.click();
    }

    public void hoverHelenaHooded() {
        actions.moveToElement(helenaHooded).perform();
    }

    public void clickAddCart(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(addHelenaHoodedToCart));
        addHelenaHoodedToCart.click();
    }

    public void selectOptions(){
        sizeM.click();
        yellowColor.click();
    }
    public void helenaAddToCart(){
        helenaAddToCartButton.click();
    }
    public void goHomePage(){
        goHomePage.click();
    }

    public void hoverPushItBag() {
        actions.moveToElement(pushItBag).perform();
    }

    public void clickAddToCartPushItBag(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(addPushItBagToCart));
        addPushItBagToCart.click();
    }
}
