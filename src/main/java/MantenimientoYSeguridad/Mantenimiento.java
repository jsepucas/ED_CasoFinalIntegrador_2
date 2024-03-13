package MantenimientoYSeguridad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mantenimiento {
    private String descripcion;
    private String tipo; // "Regular" o "Urgente"
    private Date fechaProgramada;
    private Date fechaFinalizacion;
    private boolean completado;

    public Mantenimiento(String descripcion, String tipo, Date fechaProgramada) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaProgramada = fechaProgramada;
        this.fechaFinalizacion = null; // Inicialmente, no hay fecha de finalización
        this.completado = false; // Inicialmente, la tarea no está completada
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
        this.completado = true;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
        if(completado) {
            this.fechaFinalizacion = new Date();
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaProgStr = fechaProgramada != null ? sdf.format(fechaProgramada) : "No especificada";
        String fechaFinStr = completado && fechaFinalizacion != null ? sdf.format(fechaFinalizacion) : "No completada";

        return "Descripción: " + descripcion + "\n" +
                "Tipo: " + tipo + "\n" +
                "Fecha Programada: " + fechaProgStr + "\n" +
                "Fecha de Finalización: " + fechaFinStr + "\n" +
                "Completado: " + (completado ? "Sí" : "No");
    }
}
