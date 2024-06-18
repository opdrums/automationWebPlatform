package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class loginUserPo extends pageObjects.WebBasePage {

    private String mainElement = "//span[normalize-space()='Replaceable']";
    private String buttonConfirmenAlert = "//*[@id='hs-eu-confirmation-button']";
    private String fieldEmail = "//input[@name='email']";
    private String fielPassword ="//input[@name='password']";

    private String buttonLogin ="//button[@type='submit']//span[@class='MuiButton-label'][normalize-space()='Ingresar']";


    public void clickButtonAlertDeliviry(){
        waitUntilElementIsVisible(element(buttonConfirmenAlert));
        element(buttonConfirmenAlert).click();
    }

    public void FormUserLogin(String email, String password){
        element(fieldEmail).sendKeys(email);
        element(fielPassword).sendKeys(password);
        waitUntilElementIsVisible(element(buttonLogin));
        element(buttonLogin).click();
    }

    public void clickElementMain(String elm){
        clickElementList(mainElement, elm);
    }

    public boolean validateElement(String elm){
        waitTime(20);
        return isvisibleElementT(mainElement, elm);
    }

    public String getTextElement(String elm){
        return getTextElementMain(mainElement,elm);
    }

}
