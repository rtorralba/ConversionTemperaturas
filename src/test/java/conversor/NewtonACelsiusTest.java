package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewtonACelsiusTest {
    @Test
    public void convierteUno() {
        ConversorACelsius conversorACelsius = new NewtonACelsius();
        assertEquals(3.03, conversorACelsius.convierteACelsius(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        ConversorACelsius conversorACelsius = new NewtonACelsius();
        assertEquals(30.3, conversorACelsius.convierteACelsius(10), 0.1);
    }
}
