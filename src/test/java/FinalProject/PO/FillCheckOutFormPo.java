package FinalProject.PO;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FillCheckOutFormPo {
    private WebDriver driver;
    private WebDriverWait wait;

    private JavascriptExecutor js;

    public FillCheckOutFormPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(id = "customer-email")
    WebElement email;

    @FindBy(css = "div[class='control'] [name='firstname']")
    WebElement name;

    @FindBy(css = "div[class='control'] [name='lastname']")
    WebElement lastName;

    @FindBy(css = "div[class='control'] [name='street[0]']")
    WebElement address;

    @FindBy(css = "div[class='control'] [name='city']")
    WebElement city;

    @FindBy(css = "div[class='control'] [name='region_id']")
    WebElement provinceList;

    @FindBy(css = "div[class='control'] [name='postcode']")
    WebElement zipCode;

    @FindBy(css = "div[class='control _with-tooltip'] [name='telephone']")
    WebElement phoneNumber;

    @FindBy(css = "div[id = 'checkout-shipping-method-load'] table tbody tr:nth-child(1) td:nth-child(1) input")
    WebElement fixedRadioButton;
    @FindBy(css = "div[class='actions-toolbar'] [class='button action continue primary']")
    WebElement nextButton;

    @FindBy(css = "button[class = 'action primary checkout']")
    WebElement placeOrderButton;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span")
    WebElement finalMessage;

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setCity(String city) {
        this.city.sendKeys(city);
    }
    public void setProvinceList(String province) {
        Select objSelect = new Select(provinceList);
        objSelect.selectByVisibleText(province);
    }

    public void setZipCode(String zipCode) {
        this.zipCode.sendKeys(zipCode);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void setFixedRadioButton() {
        this.fixedRadioButton.click();
    }

    public void clickNextButton(){
        this.nextButton.click();
    }

    public void clickPlaceOrderButton(){
        this.placeOrderButton.click();
    }

    public void getFinalMessage() {
        String message = finalMessage.getText();
        Assert.assertEquals("Thank you for your purchase!", message);
    }

}
