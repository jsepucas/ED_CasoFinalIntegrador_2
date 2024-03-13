package Habitats;

public class H_Insectos extends Habitat{
    protected int cantidadDeHormigueros;
    protected String tipoDeInsectos;

    public H_Insectos(String name, double temperatura, double humedad, boolean estaLimpio, int cantidadDeHormigueros, String tipoDeInsectos) {
        super(name, temperatura, humedad, estaLimpio);
        this.cantidadDeHormigueros = cantidadDeHormigueros;
        this.tipoDeInsectos = tipoDeInsectos;
    }

    public H_Insectos(String name, double temperatura, double humedad, boolean limpieza) {
        super(name, temperatura, humedad, limpieza);
    }

    public int getCantidadDeHormigueros() {
        return cantidadDeHormigueros;
    }

    public void setCantidadDeHormigueros(int cantidadDeHormigueros) {
        this.cantidadDeHormigueros = cantidadDeHormigueros;
    }

    public String getTipoDeInsectos() {
        return tipoDeInsectos;
    }

    public void setTipoDeInsectos(String tipoDeInsectos) {
        this.tipoDeInsectos = tipoDeInsectos;
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Cantidad de hormigueros: " + getCantidadDeHormigueros());
        System.out.println("Tipo de insectos: " + getTipoDeInsectos());
    }
}
