package demo.serenity.is.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.serenity.is.questions.ValidarTerritorioAgregado;
import demo.serenity.is.tasks.AgregarTerritorio;
import demo.serenity.is.tasks.BuscarTerritorio;
import demo.serenity.is.tasks.IngresarOpcionTerritorios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AgregarTerritorioStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    @Before
    public void configuracion (){
        juan.can(BrowseTheWeb.with(navegador)); }


    @When("^el usuario ingresa a la opcion de territorio$")
    public void elUsuarioIngresaALaOpcionDeTerritorio() {
        juan.attemptsTo(IngresarOpcionTerritorios.ingresarOpcionTerritorios());
    }


    @When("^el usuario agrega un nuevo territorio$")
    public void elUsuarioAgregaUnNuevoTerritorio() {
       juan.attemptsTo(AgregarTerritorio.agregarTerritorio());
    }

    @When("^el usuario ingresa en el buscador el nuevo territorio$")
    public void elUsuarioIngresaEnElBuscadorElNuevoTerritorio() {
        juan.attemptsTo(BuscarTerritorio.buscarTerritorio());
    }

    @Then("^el usuario valida que se halla agregado el territorio$")
    public void elUsuarioValidaQueSeHallaAgregadoElTerritorio() throws IOException {
        juan.should(GivenWhenThen.seeThat("El usuario valida que el Id si se halla encontrado",
                ValidarTerritorioAgregado.validarTerritorioAgregado(), Matchers.equalTo(true)));

    }


}
