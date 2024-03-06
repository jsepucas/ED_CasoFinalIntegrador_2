package Habitats;

public class H_Acuaticos extends Habitat {
    protected double profundidad;

    public HabitatAcuatico(double temperatura, double humedad, boolean estaLimpio, double profundidad) {
        super(temperatura, humedad, estaLimpio);
        this.profundidad = profundidad;
    }