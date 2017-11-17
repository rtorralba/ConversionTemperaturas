package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusANewtonTest {
    @Test
    public void convierteCuarentaCelsiusANewtonTest() {
        ConversorTemperaturas conversorTemperaturas = new CelsiusANewton();
        assertEquals(13.2, conversorTemperaturas.convierte(40), 0.1);
    }

    @Test
    public void convierteOchentaCelsiusANewtonTest() {
        ConversorTemperaturas conversorTemperaturas = new CelsiusANewton();
        assertEquals(26.4, conversorTemperaturas.convierte(80), 0.1);
    }
}
