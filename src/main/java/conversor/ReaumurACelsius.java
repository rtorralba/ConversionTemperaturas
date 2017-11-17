package conversor;

public class ReaumurACelsius implements ConversorTemperaturas {
    @Override
    public double convierte(double temperature) {
        return temperature / (4.0/5.0);
    }
}
