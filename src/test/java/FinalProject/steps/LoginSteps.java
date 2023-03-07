package FinalProject.steps;

import FinalProject.PO.LoginPo;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {



    LoginPo loginPo = new LoginPo(driver);

    @And("Click on Sign in button")
    public void clickSignInButton() {
        loginPo.clickSignInButton();
    }
    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }

    @And("I fill password {string}")
    public void iFillPassword(String text) {
        loginPo.fillPassword(text);
    }
    @And(value = "I click on loginButton")
    public void clickLoginButton() {
        loginPo.clickLoginButton();
    }

    @Then("Validate captcha message")
    public void validateCaptchaMessage() {
    loginPo.validateCaptchaMessage();
    }
}
