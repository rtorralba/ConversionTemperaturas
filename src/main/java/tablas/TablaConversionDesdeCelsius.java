package tablas;

import conversor.CelsiusAFahrenheit;
import conversor.CelsiusAKelvin;
import conversor.CelsiusAReamur;
import conversor.ConversorDesdeCelsius;

import java.util.ArrayList;
import java.util.List;

public class TablaConversionDesdeCelsius {
    private List<ConversorDesdeCelsius> conversores = new ArrayList<ConversorDesdeCelsius>();
    private double celsiusInicial;
    private double celsiusFinal;
    private double paso;

    public TablaConversionDesdeCelsius(double celsiusInicial, double celsiusFinal, double paso) {
        this.celsiusInicial = celsiusInicial;
        this.celsiusFinal = celsiusFinal;
        this.paso = paso;
    }

    public void addConversor(ConversorDesdeCelsius conversor) {
        conversores.add(conversor);
    }

    public String generaTabla() {
        StringBuilder sb = new StringBuilder();
        double celsius = celsiusInicial;
        while(celsius <= celsiusFinal) {
            sb.append(celsius);
            sb.append(",");
            for (ConversorDesdeCelsius conversor : conversores) {
                sb.append(conversor.covierteDesdeCelsius(celsius));
                sb.append(",");
            }
            sb.append("\n");
            celsius += paso;
        }
        return sb.toString();
    }
}