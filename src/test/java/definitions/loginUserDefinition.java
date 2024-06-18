package definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginUserStep;

public class loginUserDefinition {
    @Steps
    loginUserStep login = new loginUserStep();

    @When("the user clicks on the alert delivery button")
    public void clickAlert(){
        login.clickButtonAlert();
    }

    @Given("^ingresas(.*) y (.*)$")
    public void formFieldLogin(String email, String password){
        login.formLogin(email, password);
    }

    @When("^seleccionar el elemento del menu (.*)$")
    public void selectElementMain(String value){
        login.validationLogin(value);
    }

}
