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
    public void formularioLoginPaso(String email, String password){
        loginUserPo.formularioLogin(email, password);
    }

    @Step
    public void clickBotonLogintPaso(){
        loginUserPo.ClickBotonLogin();
    }

    @Step
    public void formularioLoginOrangePaso(){
        loginUserPo.formularioLogin(loginUserPo.obtenerTextoFormularioUsuario(), loginUserPo.obtenerTextoFormularioPassword());
    }

   @Step
    public void validacionTextoLogin(){
        if(!loginUserPo.validacionLogin()){
            Report.reports("FAIL", "elemento no encontrado", Report.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("elemento no encontrado");
        }

        Report.reports("PASS", "Elemento encontrado al hacer login",Report.takeSnapShot(DriverFactory.getDriver()));
    }

    @Step
    public void validacionCrdencialesFallidoPaso(){
        if(!loginUserPo.validacionCredencialesInvalidas()){
            Report.reports("FAIL", "elemento no encontrado el texto" + loginUserPo.obtenerTextoCredencialesInvalidas(), Report.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("elemento no encontrado");
        }

        Report.reports("PASS", "Elemento encontrado al hacer login" + loginUserPo.obtenerTextoCredencialesInvalidas(),Report.takeSnapShot(DriverFactory.getDriver()));
    }
}
