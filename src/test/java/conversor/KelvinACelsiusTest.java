package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KelvinACelsiusTest {
    ConversorTemperaturas conversorTemperaturas = new KelvinACelsius();
    @Test
    public void convierteUno() {

        assertEquals(-272.15, conversorTemperaturas.convierte(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        assertEquals(-263.15, conversorTemperaturas.convierte(10), 0.1);
    }
}
