package demo.serenity.is.questions;


import demo.serenity.is.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogin implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return HomePage.MSJ_DASHBOARD.resolveFor(actor).isVisible();
    }


    public static Question validarLogin(){ return new ValidarLogin(); }


}