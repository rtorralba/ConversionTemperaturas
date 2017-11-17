package conversor;

public class ConversorUniversal {
    public void setConversorOrigen(ConversorTemperaturas conversorOrigen) {
        this.conversorOrigen = conversorOrigen;
    }

    public void setConversorDestino(ConversorTemperaturas conversorDestino) {
        this.conversorDestino = conversorDestino;
    }

    protected ConversorTemperaturas conversorOrigen;
    protected ConversorTemperaturas conversorDestino;

    public double convertir(double temperatura) throws Exception {
        if (conversorOrigen == null) {
            throw new Exception("Falta el conversor origen");
        }
        if (conversorDestino == null) {
            throw new Exception("Falta el conversor origen");
        }
        return conversorDestino.convierte(conversorOrigen.convierte(temperatura));
    }
}
