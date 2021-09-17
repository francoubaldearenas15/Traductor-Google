package traductor_google.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import traductor_google.userinterface.TraductorGoogleTest;

public class Traducir implements Task {

    public Traducir(String origen, String destino, String palabrai) {
        this.origen = origen;
        this.destino = destino;
        this.palabrai = palabrai;
    }
    private String origen;
    private String destino;
    private String palabrai;

    public static Traducir deInglesAEspanol(String origen, String destino, String palabrai) {
        return Tasks.instrumented(Traducir.class, origen, destino, palabrai);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TraductorGoogleTest.BUTTON_IDIOMAS)
                ,Enter.theValue(origen).into(TraductorGoogleTest.INPUT_IDIOMA)
                ,Click.on(TraductorGoogleTest.BUTTON_IDIOMAO)
                //Idioma destino
                ,Click.on(TraductorGoogleTest.BUTTON_IDIOMASD)
                ,Enter.theValue(destino).into(TraductorGoogleTest.INPUT_IDIOMAD)
                ,Click.on(TraductorGoogleTest.BUTTON_IDIOMAD)

                ,Enter.theValue(palabrai).into(TraductorGoogleTest.INPUT_TEXT)
        );
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
