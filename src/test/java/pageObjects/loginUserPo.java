package pageObjects;



public class loginUserPo extends WebBasePage {

    private String campoEMail = "//input[@name='username']";
    private String campoPassword ="//input[@name='password']";
    private String botonLogin ="//div[2]/form/div[3]/button";
    private String textoEmail = "//header/div[1]/div[3]/ul/li/span/p";
    private String credencialesInvalidas = "//div[2]/div/div[1]/div[1]/p";
    private String obtenerTextoUsuario = "//div/div[2]/div[2]/div/div/p[1]";
    private String obtenerTextoPassword= "//div/div[2]/div[2]/div/div/p[2]";

    public void formularioLogin(String email, String password){
        sendTextLocator(campoEMail, email);
        sendTextLocator(campoPassword, password);
    }

    public void  ClickBotonLogin(){
        waitUntilElementIsVisible(element(botonLogin));
        clickElementLocator(botonLogin);
    }

    public boolean validacionLogin(){
        return validateElmentLocator(textoEmail);
    }

    public String obtenerTextoCredencialesInvalidas(){
        return  getTextElementLocator(credencialesInvalidas);
    }

    public boolean validacionCredencialesInvalidas(){
        return validateElmentLocator (credencialesInvalidas);
    }

    public  String obtenerTextoFormularioUsuario(){
        return getTextElmLocalator(obtenerTextoUsuario);
    }

    public  String obtenerTextoFormularioPassword(){
        return  getTextElmLocalator(obtenerTextoPassword);
    }
}
