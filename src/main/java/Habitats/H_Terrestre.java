package Habitats;

public class H_Terrestre extends Habitat {
    protected String tipoDeSuelo;
    protected String vegetacion;  // Nueva propiedad

    public H_Terrestre(String name, double temperatura, double humedad, boolean estaLimpio, String tipoDeSuelo, String vegetacion) {
        super(name, temperatura, humedad, estaLimpio);
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


    //Monitoreo de las condiciones del habitat acuático
    @Override
    public void monitorearCondiciones() {
        System.out.println("Tipo de suelo: " + getTipoDeSuelo());
        System.out.println("Vegetacion: " + getVegetacion());  //
    }
}


