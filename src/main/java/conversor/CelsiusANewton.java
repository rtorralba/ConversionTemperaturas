package conversor;

public class CelsiusANewton implements ConversorTemperaturas {
    @Override
    public double convierte(double temperatura) {
        return temperatura * 0.33000;
    }
}
