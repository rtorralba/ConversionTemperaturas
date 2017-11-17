package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitACelsiusTest {
    @Test
    public void convierteUno() {
        ConversorACelsius conversorACelsius = new FahrenheitACelsius();
        assertEquals(-17.2222, conversorACelsius.convierteACelsius(1), 0.1);
    }

    @Test
    public void convierteDiez() {
        ConversorACelsius conversorACelsius = new FahrenheitACelsius();
        assertEquals(-12.2222, conversorACelsius.convierteACelsius(10), 0.1);
    }
}
