package definitions;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import steps.browserStep;

public class openBrowserDefinition {
    private static String ambiente = "";
    @Steps
    browserStep browserStep;

    public openBrowserDefinition(){
        this.browserStep = new browserStep();
    }

    @Given("^open to web (.*)$")
    public void ingresarLatamAmbiente(String ambiente){
        openBrowserDefinition.ambiente = ambiente.trim();
        browserStep.openNavegate(openBrowserDefinition.ambiente.toUpperCase());
        browserStep.openNavegate(ambiente);
    }
}
