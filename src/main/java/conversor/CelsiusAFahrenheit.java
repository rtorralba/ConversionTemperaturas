package conversor;

public class CelsiusAFahrenheit implements ConversorTemperaturas {
    @Override
    public double convierte(double temperatura) {
        return 9.0/5.0 * temperatura + 32.0;
    }
}
