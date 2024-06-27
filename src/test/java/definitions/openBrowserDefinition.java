package definitions;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import steps.browserStep;

public class openBrowserDefinition {
    private static String atmosphere = "";
    @Steps
    browserStep browserStep;

    public openBrowserDefinition(){
        this.browserStep = new browserStep();
    }

    @Given("^open to web (.*)$")
    public void openLatam(String atmosphere){
        openBrowserDefinition.atmosphere = atmosphere.trim();
        browserStep.openNavegate(openBrowserDefinition.atmosphere.toUpperCase());
        browserStep.openNavegate(atmosphere);
    }
}
