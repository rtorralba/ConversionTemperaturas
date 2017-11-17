package conversor;

public class NewtonACelsius implements ConversorACelsius {
    @Override
    public double convierteACelsius(double temperature) {
        return temperature / 0.33;
    }
}
