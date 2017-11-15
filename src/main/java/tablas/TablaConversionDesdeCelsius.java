package tablas;

import conversor.CelsiusAFahrenheit;
import conversor.CelsiusAKelvin;
import conversor.CelsiusAReamur;
import conversor.ConversorDesdeCelsius;

import java.util.ArrayList;
import java.util.List;

public class TablaConversionDesdeCelsius {
    private double celsiusInicial;
    private double celsiusFinal;
    private double paso;

    public TablaConversionDesdeCelsius(double celsiusInicial, double celsiusFinal, double paso) {
        this.celsiusInicial = celsiusInicial;
        this.celsiusFinal = celsiusFinal;
        this.paso = paso;
    }

    public String generaTabla() {
        List<ConversorDesdeCelsius> conversores = new ArrayList<ConversorDesdeCelsius>();
        conversores.add(new CelsiusAFahrenheit());
        conversores.add(new CelsiusAReamur());
        conversores.add(new CelsiusAKelvin());


        StringBuilder sb = new StringBuilder();
        double celsius = celsiusInicial;
        while(celsius <= celsiusFinal) {
            sb.append(celsius);
            sb.append(",");
            for (ConversorDesdeCelsius conversor : conversores) {
                sb.append(conversor.covierteDesdeCelsius(celsius));
                sb.append(",");
            }
            celsius += paso;
        }
        return sb.toString();
    }
}