package demo.serenity.is.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/")

public class LoginPage extends PageObject {


    public static final Target LBL_USUARIO = Target.the("usuario").located(By.xpath("//input[@id='LoginPanel0_Username']"));
    public static final Target LBL_CLAVE = Target.the("contraseña").located(By.xpath("//input[@id='LoginPanel0_Password']"));
    public static final Target BTN_INGRESAR = Target.the("boton ingresar").located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));


}
