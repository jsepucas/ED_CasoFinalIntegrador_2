package Recursos;
import java.util.Date;

public class Recursos {
    protected String nombre;
    protected int cantidad;
    protected Date fechaCaducidad; // Null para recursos sin fecha de caducidad

    // Constructor
    public Recursos(String nombre, int cantidad, Date fechaCaducidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    }

