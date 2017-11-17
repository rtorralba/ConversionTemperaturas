package conversor;

public class KelvinACelsius implements ConversorTemperaturas {
    @Override
    public double convierte(double temperature) {
        return temperature - 273.15;
    }
}
