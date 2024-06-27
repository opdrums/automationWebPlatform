package pageObjects;



public class loginUserPo extends WebBasePage {

    private String mainElement = "//span[normalize-space()='Replaceable']";
    private String buttonConfirmenAlert = "//*[@id='hs-eu-confirmation-button']";
    private String fieldEmail = "//input[@name='email']";
    private String fielPassword ="//input[@name='password']";
    private String buttonLogin ="//button[@type='submit']//span[@class='MuiButton-label'][normalize-space()='Ingresar']";


    public void clickButtonAlertDeliviry(){
        waitUntilElementIsVisible(element(buttonConfirmenAlert));
        clickELementLocator(buttonConfirmenAlert);
    }

    public void FormUserLogin(String email, String password){
        sendTextLocator(fieldEmail, email);
        sendTextLocator(fielPassword, password);
        waitUntilElementIsVisible(element(buttonLogin));
        clickELementLocator(buttonLogin);
    }

    public void clickElementMain(String elm){
        clickElementList(mainElement, elm);
    }

    public boolean validateElement(String elm){
        waitTime(20);
        return validateELmentMain(mainElement, elm);
    }

    public String getTextElement(String elm){
        return getTextElementMain(mainElement,elm);
    }

}
