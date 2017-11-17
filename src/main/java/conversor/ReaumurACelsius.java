package conversor;

public class ReaumurACelsius implements ConversorACelsius {
    @Override
    public double convierteACelsius(double temperature) {
        return temperature / (4.0/5.0);
    }
}
