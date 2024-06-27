package pageObjects;

public class registerUserPo extends pageObjects.WebBasePage {

    private String mainElement = "//span[normalize-space()='Replaceable']";
    private String buttonCountry ="//div[@class='flag co']";
    private String fieldName = "//input[@name='passenger.name']";
    private String fieldEmail = "//input[@name='passenger.email']";
    private String fieldPhone = "//input[@name='passenger.phone']";
    private String fieldPassword = "//input[@name='passenger.password']";
    private String clickButtonCheckBoss = "//input[@name='passenger.has_accepted_tc']";
    private String clickButtonRegister = "//button[@type='submit']//span[@class='MuiButton-label'][normalize-space()='Replaceable']";

    public void registerUserPersonDelivery(String register, String person){
        clickElementList(mainElement,register);
        clickElementList(mainElement,person);
    }


    public void formUserRegister(String name, String email, String phone, String password){
        sendTextLocator(fieldName, name);
        sendTextLocator(fieldEmail, email);
        sendTextLocator(fieldPhone, phone);
        sendTextLocator(fieldPassword, password);
    }

    public void selectCountry(String elm){
        clickELementLocator(buttonCountry);
        clickElementList(mainElement,elm);
    }

    public void clickCheckBossAndRegisterSuccess(String elm){
        clickELementLocator(clickButtonCheckBoss);
        clickElementList(clickButtonRegister,elm);
    }

}
