package Habitats;

public class HabitatTerrestre extends Habitat {
    protected String tipoDeSuelo;
    protected String vegetacion;  // Nueva propiedad

    public HabitatTerrestre(double temperatura, double humedad, boolean estaLimpio, String tipoDeSuelo, String vegetacion) {
        super(temperatura, humedad, estaLimpio);
        this.tipoDeSuelo = tipoDeSuelo;
        this.vegetacion = vegetacion;  // Inicializar la nueva propiedad
    }


    public String getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(String tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    // Getter para vegetacion
    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Esta limpio: " + isEstaLimpio());
        System.out.println("Tipo de suelo: " + getTipoDeSuelo());
        System.out.println("Vegetacion: " + getVegetacion());  // Imprimir la nueva propiedad
    }
}


