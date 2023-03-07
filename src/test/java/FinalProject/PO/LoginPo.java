package FinalProject.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo {
    private WebDriver driver;

    public LoginPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement usernameField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(id = "send2")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div")
    WebElement captchaText;

    public void clickSignInButton()
    {
        this.signInButton.click();
    }
    public void fillUserName(String text){
        this.usernameField.sendKeys(text);
    }
    public void fillPassword(String text){
        this.passwordField.sendKeys(text);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }
    public void validateCaptchaMessage() {
        String captcha = this.captchaText.getText();
        Assert.assertEquals("Incorrect CAPTCHA", captcha);
    }
}
