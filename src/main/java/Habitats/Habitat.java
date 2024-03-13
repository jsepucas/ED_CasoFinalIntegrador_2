package Habitats;

public abstract class Habitat {
    protected String name;
    protected double temperatura;
    protected double humedad;
    protected boolean EsLalimpieza;

    public Habitat(String name, double temperatura, double humedad, boolean limpieza) {
        this.name = name;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.EsLalimpieza = limpieza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public abstract void monitorearCondiciones();

    @Override
    public String toString() {
        return "Habitat{" +
                "name=" + name + '\'' +
                ", temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", EsLalimpieza=" + EsLalimpieza +
                '}';
    }
}

