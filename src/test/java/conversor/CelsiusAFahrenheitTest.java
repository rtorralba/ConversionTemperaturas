package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAFahrenheitTest {
    @Test
    public void convierteCeroCelsiusAFahrenheitTest() {
        ConversorTemperaturas conversorTemperaturas = new CelsiusAFahrenheit();
        assertEquals(32.0, conversorTemperaturas.convierte(0));
    }

    @Test
    public void conviertCuarentaCelsiusAFahrenheitTest() {
        ConversorTemperaturas conversorTemperaturas = new CelsiusAFahrenheit();
        assertEquals(104.0, conversorTemperaturas.convierte(40));
    }
}
