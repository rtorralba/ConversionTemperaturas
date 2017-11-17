package conversor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAReaumurTest {
    @Test
    public void convierteCeroCelsiusAReaumurTest() {
        ConversorDesdeCelsius conversor = new CelsiusAReaumur();
        assertEquals(0, conversor.covierteDesdeCelsius(0));
    }
}
