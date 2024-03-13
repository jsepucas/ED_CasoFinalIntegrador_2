package Habitats;

public class H_Acuaticos extends Habitat {
    protected double profundidad;

    public H_Acuaticos(String name, double temperatura, double humedad, boolean estaLimpio, double profundidad) {
        super(name, temperatura, humedad, estaLimpio);
        this.profundidad = profundidad;
    }

    public H_Acuaticos(String name, double temperatura, double humedad, boolean limpieza) {
        super(name, temperatura, humedad, limpieza);
    }

    //Getters y setters de la clase H_Acuaticos
    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    //Monitoreo de las condiciones del habitat acuático
    @Override
    public void monitorearCondiciones() {
        System.out.println("Profundidad: " + getProfundidad());
    }
}