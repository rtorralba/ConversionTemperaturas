package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAReaumurTest {
    @Test
    public void convierteCeroCelsiusAReaumurTest() {
        ConversorTemperaturas conversorTemperaturas = new CelsiusAReaumur();
        assertEquals(0, conversorTemperaturas.convierte(0));
    }
}
