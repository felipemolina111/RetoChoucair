package demo.serenity.is.tasks;

import demo.serenity.is.userInterfaces.LoginPage;
import demo.serenity.is.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {


    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try { actor.attemptsTo(
                Enter.theValue(datos.leerDatosExcel("Datos.xlsx","GENERAL",2,1)).into(LoginPage.LBL_USUARIO),
                Enter.theValue(datos.leerDatosExcel("Datos.xlsx","GENERAL",3,1)).into(LoginPage.LBL_CLAVE),
                Click.on(LoginPage.BTN_INGRESAR)
        );
        }
        catch (IOException e){

        }


    }

    public static Login login (){return instrumented (Login.class);}
}
