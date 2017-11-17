package conversor;

public class FahrenheitACelsius implements ConversorTemperaturas {

    @Override
    public double convierte(double temperature) {
        return 5.0/9.0 * (temperature - 32);
    }
}
