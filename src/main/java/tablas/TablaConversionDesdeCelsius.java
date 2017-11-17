package tablas;

import conversor.ConversorTemperaturas;

import java.util.ArrayList;
import java.util.List;

public class TablaConversionDesdeCelsius {
    private List<ConversorTemperaturas> conversores = new ArrayList<ConversorTemperaturas>();
    private double celsiusInicial;
    private double celsiusFinal;
    private double paso;

    public TablaConversionDesdeCelsius(double celsiusInicial, double celsiusFinal, double paso) {
        this.celsiusInicial = celsiusInicial;
        this.celsiusFinal = celsiusFinal;
        this.paso = paso;
    }

    public void addConversor(ConversorTemperaturas conversorTemperaturas) {
        conversores.add(conversorTemperaturas);
    }

    public String generaTabla() {
        StringBuilder sb = new StringBuilder();
        double celsius = celsiusInicial;
        while(celsius <= celsiusFinal) {
            sb.append(celsius);
            sb.append(",");
            for (ConversorTemperaturas conversorTemperaturas : conversores) {
                sb.append(conversorTemperaturas.convierte(celsius));
                sb.append(",");
            }
            sb.append("\n");
            celsius += paso;
        }
        return sb.toString();
    }
}