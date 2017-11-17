package conversor;

public class CelsiusAReaumur implements ConversorTemperaturas {
    @Override
    public double convierte(double temperatura) {
        return 4.0/5.0 * temperatura;
    }
}
