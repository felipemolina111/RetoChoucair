package demo.serenity.is.tasks;

import demo.serenity.is.userInterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IngresarOpcionTerritorios implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(HomePage.BTN_NORTHWIND),
               Click.on(HomePage.BTN_TERRITORIOS)
       );
    }

    public static IngresarOpcionTerritorios ingresarOpcionTerritorios ()
    {return instrumented (IngresarOpcionTerritorios.class);}
}
