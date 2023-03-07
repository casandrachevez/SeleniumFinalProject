package FinalProject.steps;

import FinalProject.PO.FillCheckOutFormPo;
import FinalProject.driver.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Map;
public class CheckOutSteps extends DriverManager {

    FillCheckOutFormPo fillCheckOutFormPo = new FillCheckOutFormPo(driver);

    @And("I fill checkout form")
    public void fillOutForm(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        if(map.containsKey("email"))fillCheckOutFormPo.setEmail(map.get("email"));
        if(map.containsKey("name"))fillCheckOutFormPo.setName(map.get("name"));
        if(map.containsKey("lastName"))fillCheckOutFormPo.setLastName(map.get("lastName"));
        if(map.containsKey("street"))fillCheckOutFormPo.setAddress(map.get("street"));
        if(map.containsKey("city"))fillCheckOutFormPo.setCity(map.get("city"));
        if(map.containsKey("province"))fillCheckOutFormPo.setProvinceList(map.get("province"));
        if(map.containsKey("zipCode"))fillCheckOutFormPo.setZipCode(map.get("zipCode"));
        if(map.containsKey("phoneNumber"))fillCheckOutFormPo.setPhoneNumber(map.get("phoneNumber"));
        fillCheckOutFormPo.setFixedRadioButton();

    }

    @And("Click Next Button")
    public void clickNextButton() {
        fillCheckOutFormPo.clickNextButton();
    }

    @And("Click Place Order Button")
    public void clickPlaceOrderButton() {
        fillCheckOutFormPo.clickPlaceOrderButton();
    }

    @And("Validate final message")
    public void validateFinalMessage() {
        fillCheckOutFormPo.getFinalMessage();
    }
}
