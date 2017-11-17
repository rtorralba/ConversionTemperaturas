package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaumurACelsiusTest {
    @Test
    public void convierteUno() {
        ConversorACelsius conversorACelsius = new ReaumurACelsius();
        assertEquals(1.25, conversorACelsius.convierteACelsius(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        ConversorACelsius conversorACelsius = new ReaumurACelsius();
        assertEquals(12.50, conversorACelsius.convierteACelsius(10), 0.1);
    }
}
