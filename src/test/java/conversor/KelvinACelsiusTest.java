package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KelvinACelsiusTest {
    @Test
    public void convierteUno() {
        ConversorACelsius conversorACelsius = new KelvinACelsius();
        assertEquals(-272.15, conversorACelsius.convierteACelsius(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        ConversorACelsius conversorACelsius = new KelvinACelsius();
        assertEquals(-263.15, conversorACelsius.convierteACelsius(10), 0.1);
    }
}
