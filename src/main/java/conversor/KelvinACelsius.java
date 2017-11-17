package conversor;

public class KelvinACelsius implements ConversorACelsius {
    @Override
    public double convierteACelsius(double temperature) {
        return temperature - 273.16;
    }
}
