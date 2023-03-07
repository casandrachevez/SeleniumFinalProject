package FinalProject.steps;

import FinalProject.PO.ShoppingCartPo;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
public class ShopSteps extends DriverManager {

    ShoppingCartPo shoppingCart = new ShoppingCartPo(driver);
    @And("click Shopping cart link")
    public void clickShoppingCartLink() {
        shoppingCart.clickShoppingCartLink();

    }

    @Then("validate Helena hooded was added to the cart")
    public void validateHelenaHoodedWasAddedToTheCart() {
        shoppingCart.getItem1Text();
    }

    @Then("validate Push it Bag was added to the cart")
    public void validatePushItBagWasAddedToTheCart() {
        shoppingCart.getItem2Text();
    }

    @And("click on Proceed to checkout")
    public void clickOnProceedToCheckout() {
        shoppingCart.clickCheckoutButton();
    }
}
