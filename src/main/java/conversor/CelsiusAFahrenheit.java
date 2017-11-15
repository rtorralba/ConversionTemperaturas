package conversor;

public class CelsiusAFahrenheit implements ConversorDesdeCelsius {
    @Override
    public double covierteDesdeCelsius(double celsius) {
        return 9.0/5.0 * celsius + 32.0;
    }
}
