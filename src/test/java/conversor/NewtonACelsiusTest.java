package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewtonACelsiusTest {
    ConversorTemperaturas conversorTemperaturas = new NewtonACelsius();
    @Test
    public void convierteUno() {
        assertEquals(3.03, conversorTemperaturas.convierte(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        assertEquals(30.3, conversorTemperaturas.convierte(10), 0.1);
    }
}
