package FinalProject.steps;

import FinalProject.PO.ProductsPo;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CartSteps extends DriverManager {
    ProductsPo productsPo = new ProductsPo(driver);

    @And("go to Hoodies and TShirts section")
    public void goToHoodiesAndTshirtsSection() {
        productsPo.hoverWomanList();
        productsPo.hoverTopsList();
        productsPo.clickHoodiesTShirts();
    }

    @And("Add Helena Hooded to the cart")
    public void addHelenaHoodedToTheCart() {
        productsPo.hoverHelenaHooded();
        productsPo.clickAddCart();
    }

    @Then("select options")
    public void selectOptions() {
        productsPo.selectOptions();
        productsPo.helenaAddToCart();
    }

    @Then("click Home")
    public void clickHome() {
        productsPo.goHomePage();
    }

    @And("Add Push it Messenger Bag")
    public void addPushItMessengerBag() {
        productsPo.hoverPushItBag();
        productsPo.clickAddToCartPushItBag();
    }
}
