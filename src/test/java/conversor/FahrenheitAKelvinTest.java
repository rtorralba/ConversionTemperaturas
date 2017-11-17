package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitAKelvinTest {
    @Test
    public void convierteUno() {
        ConversorACelsius conversorACelsius = new FahrenheitACelsius();
        ConversorDesdeCelsius conversorDesdeCelsius = new CelsiusAKelvin();
        double kelvin = conversorDesdeCelsius.covierteDesdeCelsius(conversorACelsius.convierteACelsius(1));
        assertEquals(255.928, kelvin, 0.1);
    }
}
