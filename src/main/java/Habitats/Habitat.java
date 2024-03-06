package Habitats;

public abstract class Habitat {
    protected double temperatura;
    protected double humedad;
    protected boolean EsLalimpieza;

    public Habitat(double temperatura, double humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.EsLalimpieza = limpieza;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isEstaLimpio() {
        boolean EsLaLimpieza = false;
        return EsLaLimpieza;
    }
    public void setEstaLimpio(boolean estaLimpio) {
        this.EsLalimpieza = estaLimpio;
    }
}