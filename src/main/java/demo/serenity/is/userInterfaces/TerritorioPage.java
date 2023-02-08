package demo.serenity.is.userInterfaces;

import demo.serenity.is.utils.Datos;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;

public class TerritorioPage extends PageObject {


    public static final Target BTN_NUEVO_TERRITORIO = Target.the("Boton agregar nuevo territorio").located(By.xpath("//div[@class='tool-button add-button icon-tool-button']"));
    public static final Target LBL_TERRITORIO_ID = Target.the("Campo de texto ID Terrritorio").located(By.xpath("//input[@name='TerritoryID']"));
    public static final Target LBL_TERRITORIO_DESCRIPCION = Target.the("Campo de texto Descripcion Territorio").located(By.xpath("//input[@name='TerritoryDescription']"));
    public static final Target LST_REGION = Target.the("Lista Region").located(By.xpath("//div[@class='select2-container editor s-Serenity-LookupEditor s-LookupEditor required']"));
    public static final Target SELECT_REGION_SUR = Target.the("Opcion sur").located(By.xpath("//div[text()='Southern']"));
    public static final Target BTN_GUARDAR = Target.the("Boton Guardar").located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));

    public static final Target LBL_BARRA_BUSQUEDA = Target.the("Campo de Texto Busqueda").located(By.xpath("//input[@CLASS='s-Serenity-QuickSearchInput s-QuickSearchInput']"));

    public static Target BTN_MSJ_ID_ENCONTRADO(String id) {
        return Target.the("Id encontrado").located(org.openqa.selenium.By.xpath("//a[text()='"+id+"']"));
    }

}
