package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitAKelvinTest {
    @Test
    public void convierteUno() throws Exception {
        ConversorTemperaturas conversorACelsius = new FahrenheitACelsius();
        ConversorTemperaturas conversorAKelvin = new CelsiusAKelvin();
        ConversorUniversal conversorUniversal = new ConversorUniversal();
        conversorUniversal.setConversorOrigen(conversorACelsius);
        conversorUniversal.setConversorDestino(conversorAKelvin);
        double kelvin = conversorUniversal.convertir(1);
        assertEquals(255.928, kelvin, 0.1);
    }
}
