package MantenimientoYSeguridad;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Seguridad {
    private String tipo; // Por ejemplo, "Cámara" o "Sensor"
    private String ubicacion;
    private boolean activo;
    private Date ultimaRevision;

    public Seguridad(String tipo, String ubicacion, boolean activo, Date ultimaRevision) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.activo = activo;
        this.ultimaRevision = ultimaRevision;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getUltimaRevision() {
        return ultimaRevision;
    }

    public void setUltimaRevision(Date ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaRevStr = ultimaRevision != null ? sdf.format(ultimaRevision) : "No especificada";

        return "Tipo: " + tipo + "\n" +
                "Ubicación: " + ubicacion + "\n" +
                "Activo: " + (activo ? "Sí" : "No") + "\n" +
                "Última Revisión: " + fechaRevStr;
    }
}
