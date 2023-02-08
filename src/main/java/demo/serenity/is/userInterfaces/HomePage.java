package demo.serenity.is.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target MSJ_DASHBOARD = Target.the("Mensaje pantalla inicio").located(By.xpath("//h1[text()='Dashboard']"));

    public static final Target BTN_NORTHWIND = Target.the("Boton Northwind").located(By.xpath("//a[@href='#nav_menu1_2_1']"));
    public static final Target BTN_TERRITORIOS = Target.the("Boton Territorios").located(By.xpath("//a[@href='/Northwind/Territory']"));


}
