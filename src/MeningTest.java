import Meningar.Mening;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeningTest {

    @Test
    public void testGrundläggandeFunktion() {
        Mening text = new Mening();

        text.addMening("Hej där!");
        text.addMening("Det här är en test.");

        assertEquals(2, text.getAntalMeningar(), "Antalet meningar ska vara 2");
        assertEquals(27, text.getAntalTecken(), "Antalet tecken ska vara 27 exklusive 'stop'");
    }

    @Test
    public void testBaraStopDirekt() {
        Mening text = new Mening();

        assertEquals(0, text.getAntalMeningar(), "Antalet meningar ska vara 0 när endast 'stop' anges");
        assertEquals(0, text.getAntalTecken(), "Antalet tecken ska vara 0 när endast 'stop' anges");
    }

    @Test
    public void testFleraKortaMeningar() {
        Mening text = new Mening();

        text.addMening("Hej");
        text.addMening("Där");

        assertEquals(2, text.getAntalMeningar(), "Antalet meningar ska vara 2");
        assertEquals(6, text.getAntalTecken(), "Antalet tecken ska vara 6 exklusive 'stop'");
    }
}
