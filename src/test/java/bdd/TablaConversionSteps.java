package bdd;

import conversor.CelsiusAFahrenheit;
import cucumber.api.java8.En;
import tablas.TablaConversionDesdeCelsius;

import static org.junit.jupiter.api.Assertions.*;

public class TablaConversionSteps implements En{
    private TablaConversionDesdeCelsius tabla;
    private String tablaGenerada;

    public TablaConversionSteps() {
        Given("^tengo una tabla$", () -> {
            tabla = new TablaConversionDesdeCelsius(0, 100, 10);
            assertNotNull(tabla);
        });

        Given("^añado un conversor de Celsius a Fahrenheit$", () -> {
            tabla.addConversor(new CelsiusAFahrenheit());
        });

        When("^muestro la tabla$", () -> {
            tablaGenerada = tabla.generaTabla();
        });

        Then("^debe aparecer la tabla$", () -> {
            assertNotNull(tablaGenerada);
            assertNotEquals(tablaGenerada, "");
        });

        Then("^la primera línea debe contener (\\d+) para grados Celsius$", (Integer arg1) -> {
            String primeraLinea = tablaGenerada.split("\n")[0];
            String valorCelsius = primeraLinea.split(",")[0].trim();
            assertEquals(Double.parseDouble(valorCelsius), arg1 * 1.0);
        });

        Then("^la primera lína debe contener (\\d+) para grados Fahrenheit$", (Integer arg1) -> {
            String primeraLinea = tablaGenerada.split("\n")[0];
            String valorCelsius = primeraLinea.split(",")[1].trim();
            assertEquals(Double.parseDouble(valorCelsius), arg1 * 1.0);
        });
    }
}
