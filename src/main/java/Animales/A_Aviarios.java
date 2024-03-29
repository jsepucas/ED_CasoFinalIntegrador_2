package Animales;

public class A_Aviarios extends A_Acuaticos{

    protected String tipoPlumaje;
    protected boolean esCapazDeVolar;
    protected String dieta;
    protected String habitatPreferido;
    protected boolean esMigratoria;


    public A_Aviarios (String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
                       String tipoPlumaje, boolean esCapazDeVolar, String dieta, String habitatPreferido, boolean esMigratoria) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.tipoPlumaje = tipoPlumaje;
        this.esCapazDeVolar = esCapazDeVolar;
        this.dieta = dieta;
        this.habitatPreferido = habitatPreferido;
        this.esMigratoria = esMigratoria;
    }

    public A_Aviarios(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril, String tipoAve, boolean puedeVolar, String alimentacion) {

    }


    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public boolean isEsCapazDeVolar() {
        return esCapazDeVolar;
    }

    public void setEsCapazDeVolar(boolean esCapazDeVolar) {
        this.esCapazDeVolar = esCapazDeVolar;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabitatPreferido() {
        return habitatPreferido;
    }

    public void setHabitatPreferido(String habitatPreferido) {
        this.habitatPreferido = habitatPreferido;
    }

    public boolean isEsMigratoria() {
        return esMigratoria;
    }

    public void setEsMigratoria(boolean esMigratoria) {
        this.esMigratoria = esMigratoria;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", tipoPlumaje='" + tipoPlumaje + '\'' +
                ", esCapazDeVolar=" + esCapazDeVolar +
                ", dieta='" + dieta + '\'' +
                ", habitatPreferido='" + habitatPreferido + '\'' +
                ", esMigratoria=" + esMigratoria;
    }




}

