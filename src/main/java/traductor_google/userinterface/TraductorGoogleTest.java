package traductor_google.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TraductorGoogleTest {

    //Busca y seleccionar Idioma Origen
    public static final Target BUTTON_IDIOMAS = Target.the("Busca los idiomas.")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/button/span"));
    public static final Target INPUT_IDIOMA = Target.the("Escribe el idioma")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[1]/div/div[2]/input"));
    public static final Target BUTTON_IDIOMAO = Target.the("Escribe el idioma")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[1]/div/div[4]/div/div[1]/div[2]"));

    //Buscar y seleccionar Idioma Destino
    public static final Target BUTTON_IDIOMASD = Target.the("Busca los idiomas.")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[5]/button/span"));
    public static final Target INPUT_IDIOMAD = Target.the("Escribe el idioma Destino")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[2]/div/div[2]/input"));
    public static final Target BUTTON_IDIOMAD = Target.the("Escribe el idioma")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[2]/div/div[4]/div/div[1]/div[2]"));

    public static final Target INPUT_TEXT = Target.the("Where do we write the text")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/span/span/div/textarea"));

    public static Target PALABRA_TRADUCIDA = Target.the("Where do we write the text")
            .located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]/span[1]/span"));
}
