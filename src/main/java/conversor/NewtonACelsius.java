package conversor;

public class NewtonACelsius implements ConversorTemperaturas {
    @Override
    public double convierte(double temperature) {
        return temperature / 0.33;
    }
}
