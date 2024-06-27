package steps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObjects.loginUserPo;
import utils.driver_factory.DriverFactory;
import utils.reporting.Report;

public class loginUserStep {

    private loginUserPo loginUserPo;

    public  loginUserStep(){
        loginUserPo = new loginUserPo();
        loginUserPo.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void clickButtonAlert(){
        loginUserPo.clickButtonAlertDeliviry();
    }

    @Step
    public void formLogin(String email, String password){
        loginUserPo.FormUserLogin(email, password);
    }

    @Step
    public void validationLogin(String elm){
        if(loginUserPo.validateElement(elm)){
            Report.reports("PASS", "element found list: " + loginUserPo.getTextElement(elm), Report.takeSnapShot(DriverFactory.getDriver()));
            loginUserPo.clickElementMain(elm);
        } else if (!loginUserPo.validateElement(elm)) {
            Report.reports("FAIL", "Not found element list", Report.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("Not found element list");
        }
    }
}
