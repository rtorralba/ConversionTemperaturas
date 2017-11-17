package conversor;

public class CelsiusAKelvin implements ConversorTemperaturas {
    @Override
    public double convierte(double temperatura) {
        return temperatura + 273.15;
    }
}
