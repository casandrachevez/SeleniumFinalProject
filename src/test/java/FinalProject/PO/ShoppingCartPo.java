package FinalProject.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;

public class ShoppingCartPo {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public ShoppingCartPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
        actions = new Actions(driver);
    }

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div/a")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[1]/tr[1]/td[1]/div/strong")
    WebElement item1;

    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[2]/tr[1]/td[1]/div/strong")
    WebElement item2;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")
    WebElement checkoutButton;
    public void clickShoppingCartLink() {
        shoppingCartLink.click();
    }

    public void getItem1Text(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(item1));
        String textItem1 = item1.getText();
        Assert.assertEquals("Helena Hooded Fleece", textItem1);
    }

    public void getItem2Text(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(item2));
        String textItem2 = item2.getText();
        Assert.assertEquals("Push It Messenger Bag", textItem2);
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}
