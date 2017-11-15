package main;

import conversor.CelsiusAFahrenheit;
import conversor.CelsiusAReamur;
import tablas.TablaConversionDesdeCelsius;

public class Main {
    public static void main(String[] args) {
        TablaConversionDesdeCelsius tabla = new TablaConversionDesdeCelsius(0,100,10);
        tabla.addConversor(new CelsiusAFahrenheit());
        tabla.addConversor(new CelsiusAReamur());
        System.out.println(tabla.generaTabla());
    }
}
