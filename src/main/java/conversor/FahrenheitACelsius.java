package conversor;

public class FahrenheitACelsius implements ConversorACelsius {

    @Override
    public double convierteACelsius(double temperature) {
        return 5.0/9.0 * (temperature - 32);
    }
}
