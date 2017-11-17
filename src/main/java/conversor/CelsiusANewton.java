package conversor;

public class CelsiusANewton implements ConversorDesdeCelsius {
    @Override
    public double covierteDesdeCelsius(double celsius) {
        return celsius * 0.33000;
    }
}
