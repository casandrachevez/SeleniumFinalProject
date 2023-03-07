package FinalProject.steps;

import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class CommonSteps extends DriverManager {
    @Then("I go to {string}")
    public void fillCrossDockSection(String link) {
        driver.get(link);
        driver.manage().window().maximize();
    }

    @Then("Just wait {int}")
    public void justWait(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
