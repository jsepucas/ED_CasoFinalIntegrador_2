package Habitats;

public class H_Aviarios extends Habitat {
    protected int cantidadDeNidos;
    protected String tipoDeAves;

    public HabitatAves(double temperatura, double humedad, boolean estaLimpio, int cantidadDeNidos, String tipoDeAves) {
        super(temperatura, humedad, estaLimpio);
        this.cantidadDeNidos = cantidadDeNidos;
        this.tipoDeAves = tipoDeAves;
    }

    // Getter para cantidadDeNidos
    public int getCantidadDeNidos() {
        return cantidadDeNidos;
    }

    public void setCantidadDeNidos(int cantidadDeNidos) {
        this.cantidadDeNidos = cantidadDeNidos;
    }

    public String getTipoDeAves() {
        return tipoDeAves;
    }

    public void setTipoDeAves(String tipoDeAves) {
        this.tipoDeAves = tipoDeAves;
    }

