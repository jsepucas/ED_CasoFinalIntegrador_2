package Habitats;

public class H_Aviarios extends Habitat {
    protected int cantidadDeNidos;
    protected String tipoDeAves;

    public H_Aviarios(String name, double temperatura, double humedad, boolean estaLimpio, int cantidadDeNidos, String tipoDeAves) {
        super(name, temperatura, humedad, estaLimpio);
        this.cantidadDeNidos = cantidadDeNidos;
        this.tipoDeAves = tipoDeAves;
    }

    public H_Aviarios(String name, double temperatura, double humedad, boolean limpieza) {
        super(name, temperatura, humedad, limpieza);
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

    @Override
    public void monitorearCondiciones() {
        System.out.println("Cantidad de nidos: " + getCantidadDeNidos());
        System.out.println("Tipo de aves: " + getTipoDeAves());
    }
}


