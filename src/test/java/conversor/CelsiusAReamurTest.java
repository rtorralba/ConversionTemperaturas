package conversor;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAReamurTest {
    @Test
    public void convierteCeroCelsiusAReamurTest() {
        ConversorDesdeCelsius conversor = new CelsiusAReamur();
        assertEquals(0, conversor.covierteDesdeCelsius(0));
    }
}
