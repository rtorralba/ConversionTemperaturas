package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaumurACelsiusTest {

    ConversorTemperaturas conversorTemperaturas = new ReaumurACelsius();

    @Test
    public void convierteUno() {

        assertEquals(1.25, conversorTemperaturas.convierte(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        assertEquals(12.50, conversorTemperaturas.convierte(10), 0.1);
    }
}
