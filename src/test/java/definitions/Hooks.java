package definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import utils.reporting.Report;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks {
    Scenario scenario;
    WebDriver driver;

    @Before
    //metodo config que envia un scenario, donde llama el archivo utils para levantar el driver
    public void config(Scenario scenario) throws IOException{
        String controlador = Utils.readProperty("configurations", "Ruta_Driver");
        String navegador = Utils.readProperty("configurations", "navegador");
        driver = DriverFactory.getDriverManager(navegador.toUpperCase(), controlador);
        //driver.manage().window().maximize();
        this.scenario = scenario;
        Report.startReport(scenario.getName());
    }

    @After
    //metodo que crea un scenario, donde cierra el navegador envia un reporte si pasa o falla y cierra el navegador
    public void quitDriver(Scenario scenario){
        if (scenario.isFailed()) {
            Report.reportCaseFail(("MODULO: "+System.getProperty("tags")+" --> ESCENARIO: "+scenario.getName()).replace("null","Web"));
            if (DriverFactory.getDriver() == null) {
                Report.reports("FAIL", "El flujo automatizado se da por finalizado debido al error generado.!");
            } else {
                DriverFactory.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                Report.reports("FAIL", "\n" + "El flujo automatizado se da por finalizado debido al error generado.!", Report.takeSnapShot(DriverFactory.getDriver()));
            }
        } else {
            Report.reports("PASS", "El flujo de automatizacion termino de forma exitosa!", Report.takeSnapShot(DriverFactory.getDriver()));
        }
        Report.finishReport();
        DriverFactory.quitDriver();
    }
}
