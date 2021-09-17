package traductor_google.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import traductor_google.userinterface.TraductorGoogleTest;

public class Answer implements Question<Boolean> {
    private String palabrae;

    public Answer(String palabrae) {
        this.palabrae = palabrae;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String palabraer;
        palabraer = Text.of(TraductorGoogleTest.PALABRA_TRADUCIDA).viewedBy(actor).asString();
        if (palabrae.equals(palabraer)){
            result = true;
            System.out.println("Esperada "+ palabrae);
            System.out.println("Real "+ palabraer);
        }else{
            result = false;
            System.out.println("Esperada "+ palabrae);
            System.out.println("Real "+ palabraer);
        }
        return result;
    }
}