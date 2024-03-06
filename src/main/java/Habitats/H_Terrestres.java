package Habitats;

public class HabitatTerrestre extends Habitat {
    protected String tipoDeSuelo;
    protected String vegetacion;  // Nueva propiedad

    public HabitatTerrestre(double temperatura, double humedad, boolean estaLimpio, String tipoDeSuelo, String vegetacion) {
        super(temperatura, humedad, estaLimpio);
        this.tipoDeSuelo = tipoDeSuelo;
        this.vegetacion = vegetacion;  // Inicializar la nueva propiedad
    }

    // Getter para tipoDeSuelo
    public String getTipoDeSuelo() {
        return tipoDeSuelo;
    }
