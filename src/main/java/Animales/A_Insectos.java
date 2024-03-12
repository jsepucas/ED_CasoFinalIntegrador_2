package Animales;

public class A_Insectos extends Animal {
    private int numeroPatas;
    private boolean tieneAlas;
    private String tipoAlimentacion;
    private String habitat;
    private boolean esBeneficioso;

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

    @Override
    public void alimentar() {
        System.out.println("Alimentando al insecto " + getNombre() + " con una dieta " + tipoAlimentacion);
    }

    @Override
    public void realizarChequeoSalud() {
        System.out.println("Realizando chequeo de salud al insecto " + getNombre() + ". Estado de salud: " + getEstadoSalud());
    }


    public void mostrarCaracteristicas() {
        System.out.println("El insecto " + getNombre() + " tiene " + numeroPatas + " patas" +
                (tieneAlas ? " y tiene alas." : " y no tiene alas.") +
                " Es " + (esBeneficioso ? "beneficioso" : "perjudicial") + " para su entorno.");
    }


}