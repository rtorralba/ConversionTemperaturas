package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitACelsiusTest {
    ConversorTemperaturas conversorTemperaturas = new FahrenheitACelsius();
    @Test
    public void convierteUno() {
        assertEquals(-17.2222, conversorTemperaturas.convierte(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        assertEquals(-12.2222, conversorTemperaturas.convierte(10), 0.1);
    }
}
