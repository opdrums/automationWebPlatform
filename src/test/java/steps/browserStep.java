package steps;

import net.thucydides.core.annotations.Step;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import pageObjects.openBrowserPo;

public class browserStep {
    private  openBrowserPo openBrowserPo;

    public browserStep() {

        openBrowserPo = new openBrowserPo();
        openBrowserPo.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void openNavegate(String ambiente) {
        try {
            openBrowserPo.getDriver().get(Utils.readProperty("configurations", "web_" + ambiente));
        } catch (Exception e) {
        }
    }
}
