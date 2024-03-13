package Recursos;

public class Recursos {
    private String nombre;
    private int cantidad;

    public Recursos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + ": " + cantidad;
    }
}
