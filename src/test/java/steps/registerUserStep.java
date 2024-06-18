package steps;
import net.thucydides.core.annotations.Step;
import pageObjects.registerUserPo;
import utils.driver_factory.DriverFactory;

public class registerUserStep {
   private registerUserPo registerUserPo;

   public registerUserStep(){
       registerUserPo = new registerUserPo();
       registerUserPo.setDriver(DriverFactory.getDriver());
   }

   @Step
    public void clickButtonRegisterAndPerson(String register, String person){
       registerUserPo.registerUserPersonDelivery(register,person);
   }

   @Step
    public void formRegisterUser(String name, String email, String phone, String password){
       registerUserPo.formUserRegister(name, email, phone, password);
   }

   @Step
   public void selectedCountry(String country){
       registerUserPo.selectCountry(country);
   }

   public void clickCheckBossAndButtonRegister(String elmButton){
       registerUserPo.clickCheckBossAndRegisterSuccess(elmButton);
   }
}
