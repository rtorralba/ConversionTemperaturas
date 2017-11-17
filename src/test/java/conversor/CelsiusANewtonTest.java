package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusANewtonTest {
    @Test
    public void convierteCuarentaCelsiusANewtonTest() {
        ConversorDesdeCelsius conversor = new CelsiusANewton();
        assertEquals(13.2, conversor.covierteDesdeCelsius(40), 0.1);
    }

    @Test
    public void convierteOchentaCelsiusANewtonTest() {
        ConversorDesdeCelsius conversor = new CelsiusANewton();
        assertEquals(26.4, conversor.covierteDesdeCelsius(80), 0.1);
    }
}
