package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAKelvinTest {
    @Test
    public void convierteCeroCelsiusAKelvinTest() {
        ConversorTemperaturas conversorTemperaturas = new CelsiusAKelvin();
        assertEquals(273.15, conversorTemperaturas.convierte(0), 0.1);
    }
}
