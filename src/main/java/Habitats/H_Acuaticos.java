package Habitats;

public class H_Acuaticos extends Habitat {
    protected double profundidad;

    public void HabitatAcuatico(double temperatura, double humedad, boolean estaLimpio, double profundidad) {
            super(temperatura, humedad, estaLimpio);
        this.profundidad = profundidad;
    }

    public H_Acuaticos(double temperatura, double humedad, boolean limpieza) {
        super(temperatura, humedad, limpieza);
    }

    //Getters y setters de la clase H_Acuaticos
    public double getProfundidad() {
        return profundidad;
    }


    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    //Monitoreo de las condiciones del habitat acuático
    public void monitorearCondiciones() {
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Esta limpio: " + isEstaLimpio());
        System.out.println("Profundidad: " + getProfundidad());
    }
}

