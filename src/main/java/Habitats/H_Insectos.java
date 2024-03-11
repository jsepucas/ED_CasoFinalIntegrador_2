package Habitats;

public class H_Insectos extends Habitat{
    protected int cantidadDeHormigueros;
    protected String tipoDeInsectos;

    public H_Insectos(double temperatura, double humedad, boolean estaLimpio, int cantidadDeHormigueros, String tipoDeInsectos) {
        super(temperatura, humedad, estaLimpio);
        this.cantidadDeHormigueros = cantidadDeHormigueros;
        this.tipoDeInsectos = tipoDeInsectos;
    }

    public H_Insectos(double temperatura, double humedad, boolean limpieza) {
        super(temperatura, humedad, limpieza);
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
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Esta limpio: " + isEstaLimpio());
        System.out.println("Cantidad de hormigueros: " + getCantidadDeHormigueros());
        System.out.println("Tipo de insectos: " + getTipoDeInsectos());
    }
}
