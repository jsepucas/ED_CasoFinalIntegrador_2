package MantenimientoYSeguridad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Camara {
    private String id;
    private String ubicacion;
    private boolean activa;
    private Date ultimaRevision;

    public Camara(String id, String ubicacion, boolean activa, Date ultimaRevision) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.activa = activa;
        this.ultimaRevision = ultimaRevision;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
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

        return "ID Cámara: " + id + "\n" +
                "Ubicación: " + ubicacion + "\n" +
                "Activa: " + (activa ? "Sí" : "No") + "\n" +
                "Última Revisión: " + fechaRevStr;
    }
}
