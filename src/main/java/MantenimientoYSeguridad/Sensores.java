package MantenimientoYSeguridad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sensores {
    private String tipo;
    private String ubicacion;
    private boolean activo;
    private Date ultimaRevision;

    public Sensores(String tipo, String ubicacion, boolean activo, Date ultimaRevision) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.activo = activo;
        this.ultimaRevision = ultimaRevision;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public Date getUltimaRevision() {
        return ultimaRevision;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setUltimaRevision(Date ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String estado = activo ? "Activo" : "Inactivo";
        String fechaRevStr = ultimaRevision != null ? sdf.format(ultimaRevision) : "No especificada";

        return "Sensor Tipo: " + tipo + "\n" +
                "Ubicación: " + ubicacion + "\n" +
                "Estado: " + estado + "\n" +
                "Última Revisión: " + fechaRevStr;
    }
}
