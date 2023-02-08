package demo.serenity.is.tasks;


import demo.serenity.is.userInterfaces.TerritorioPage;
import demo.serenity.is.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AgregarTerritorio implements Task {


    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(TerritorioPage.BTN_NUEVO_TERRITORIO),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","GENERAL",8,1)).into(TerritorioPage.LBL_TERRITORIO_ID),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","GENERAL",9,1)).into(TerritorioPage.LBL_TERRITORIO_DESCRIPCION)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                Click.on(TerritorioPage.LST_REGION),
                Click.on(TerritorioPage.SELECT_REGION_SUR),
                Click.on(TerritorioPage.BTN_GUARDAR)
        );

    }

    public static AgregarTerritorio agregarTerritorio (){return instrumented (AgregarTerritorio.class);}
}
