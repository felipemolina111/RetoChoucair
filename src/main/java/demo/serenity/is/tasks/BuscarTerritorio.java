package demo.serenity.is.tasks;

import demo.serenity.is.userInterfaces.TerritorioPage;
import demo.serenity.is.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarTerritorio implements Task {

    Datos datos = new Datos();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(TerritorioPage.LBL_BARRA_BUSQUEDA, isVisible()).forNoMoreThan(5).seconds(),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","GENERAL",8,1)).into(TerritorioPage.LBL_BARRA_BUSQUEDA)
                    );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static BuscarTerritorio buscarTerritorio (){return instrumented (BuscarTerritorio.class);}

}
