package definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginUserStep;

public class loginUserDefinition {
    @Steps
    loginUserStep login = new loginUserStep();

    @Given("^el usuario ingresa su nombre de usuario (.*) y su contraseña (.*)$")
    public void formularioUsuarioLogin(String email, String password){
        login.formularioLoginPaso(email, password);
    }

    @Given("el usuario ingresa su nombre de usuario y su contraseña")
    public void formularioLoginSinCredencial(){
        login.formularioLoginOrangePaso();
    }

    @When("hace clic en el botón de iniciar sesión")
    public void clickBotonLoginUsuario(){
        login.clickBotonLogintPaso();
    }

    @Then("el sistema debería redirigir al usuario a la página principal")
    public void ValidacionLoginExitoso(){
        login.validacionTextoLogin();
    }

    @Then("el sistema debería mostrar un mensaje de error")
    public  void ValidacionLoginFallido(){
        login.validacionCrdencialesFallidoPaso();
    }
}
