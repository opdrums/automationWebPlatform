package definitions;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import steps.registerUserStep;


public class registerUserDefinition {
    @Steps
    registerUserStep registerUser = new registerUserStep();

    @Given("^Click button (.*) selected type (.*)$")
    public void clickButtonRegister(String register, String person){
        registerUser.clickButtonRegisterAndPerson(register, person);
    }

    @When("^send information form register (.*) (.*) (.*) (.*)$")
    public void formRegisterDelivery(String name, String email, String phone, String password){
        registerUser.formRegisterUser(name, email, phone, password);
    }


    @And("^selected country(.*)$")
    public void clickButtonPerson(String country){
        registerUser.selectedCountry(country.trim());
    }

    @Then("^success the (.*)$")
    public void successRegisterUser(String elm){
        registerUser.clickCheckBossAndButtonRegister(elm);
    }
}
