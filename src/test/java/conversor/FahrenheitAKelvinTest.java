package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitAKelvinTest {
    @Test
    public void convierteUno() {
        ConversorTemperaturas conversorACelsius = new FahrenheitACelsius();
        ConversorTemperaturas conversorAkelvin = new CelsiusAKelvin();
        double kelvin = conversorAkelvin.convierte(conversorACelsius.convierte(1));
        assertEquals(255.928, kelvin, 0.1);
    }
}
