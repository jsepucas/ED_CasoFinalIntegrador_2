package Animales;

public abstract class A_Insectos extends Animal {
    protected    int numeroPatas;
    protected boolean tieneAlas;
    protected String tipoAlimentacion;
    protected String habitat;
    protected boolean esBeneficioso;

    public A_Insectos (String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
                   int numeroPatas, boolean tieneAlas, String tipoAlimentacion, String habitat, boolean esBeneficioso) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.numeroPatas = numeroPatas;
        this.tieneAlas = tieneAlas;
        this.tipoAlimentacion = tipoAlimentacion;
        this.habitat = habitat;
        this.esBeneficioso = esBeneficioso;
    }

    public A_Insectos(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
    }


    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public boolean isTieneAlas() {
        return tieneAlas;
    }

    public void setTieneAlas(boolean tieneAlas) {
        this.tieneAlas = tieneAlas;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public boolean isEsBeneficioso() {
        return esBeneficioso;
    }

    public void setEsBeneficioso(boolean esBeneficioso) {
        this.esBeneficioso = esBeneficioso;
    }

}