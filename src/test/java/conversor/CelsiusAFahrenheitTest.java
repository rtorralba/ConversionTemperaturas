package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAFahrenheitTest {
    @Test
    public void convierteCeroCelsiusAFahrenheitTest() {
        ConversorDesdeCelsius conversor = new CelsiusAFahrenheit();
        assertEquals(32.0, conversor.covierteDesdeCelsius(0));
    }

    @Test
    public void conviertCuarentaCelsiusAFahrenheitTest() {
        ConversorDesdeCelsius conversor = new CelsiusAFahrenheit();
        assertEquals(104.0, conversor.covierteDesdeCelsius(40));
    }
}
