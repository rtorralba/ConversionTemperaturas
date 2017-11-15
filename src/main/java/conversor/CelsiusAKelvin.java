package conversor;

public class CelsiusAKelvin implements ConversorDesdeCelsius {
    @Override
    public double covierteDesdeCelsius(double celsius) {
        return celsius + 273.16;
    }
}
