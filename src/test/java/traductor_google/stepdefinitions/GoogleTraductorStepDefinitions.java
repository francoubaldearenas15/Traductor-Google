package traductor_google.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import traductor_google.model.GoogleTraslateData;
import traductor_google.questions.Answer;
import traductor_google.tasks.OpenUp;
import traductor_google.tasks.Traducir;

import java.util.List;

public class GoogleTraductorStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Yeison quiere usar el traductor de Google$")
    public void queYeisonQuiereUsarElTraductorDeGoogle(){
        OnStage.theActorCalled("Yeison").wasAbleTo(OpenUp.thePage());
    }

    @When("^el traduce una palabra de ingles a espanyol (.*) (.*) (.*)$")
    public void elTraduceUnaPalabraDeInglesAEspanyol(String origen, String destino, String palabrai)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Traducir.deInglesAEspanol(origen, destino, palabrai));
    }

    @Then("^el deberia ver en la pantalla la palabra traducida del idioma origen a idioma destino (.*)$")
    public void elDeberiaVerEnLaPantallaLaPalabraTraducidaDelIdiomaOrigenAIdiomaDestinoPalabrae(String palabrae) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(palabrae)));
    }

}
