package demo.serenity.is.questions;

import demo.serenity.is.userInterfaces.TerritorioPage;
import demo.serenity.is.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;

public class ValidarTerritorioAgregado implements Question {

    Datos datos = new Datos();
    String id = datos.leerDatosExcel("Datos.xlsx","GENERAL",8,1);

    public ValidarTerritorioAgregado() throws IOException {
    }


    @Override
    public Object answeredBy(Actor actor) {
        return TerritorioPage.BTN_MSJ_ID_ENCONTRADO(id).resolveFor(actor).isVisible();
    }
    public static Question validarTerritorioAgregado() throws IOException {return new ValidarTerritorioAgregado();}
}
