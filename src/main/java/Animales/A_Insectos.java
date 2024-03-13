package Animales;

public class A_Insectos extends Animal {
    protected int numeroPatas;
    protected boolean tieneAlas;
    protected String alimentos;
    protected String habitat;
    protected boolean esBeneficioso;

    public A_Insectos (String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
                       String numeroPatas, boolean tieneAlas, String alimentos, String habitat, String esBeneficioso) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.numeroPatas = Integer.parseInt(numeroPatas);
        this.tieneAlas = tieneAlas;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.esBeneficioso = Boolean.parseBoolean(esBeneficioso);
    }


    @Override
    public void alimentar() {

    }

    @Override
    public void realizarChequeoSalud() {

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

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String tipoAlimentacion) {
        this.alimentos = tipoAlimentacion;
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
    public String toString() {
        return "Insecto:\n" +
                "  Nombre: " + getNombre() + "\n" +
                "  Edad: " + getEdad() + "\n" +
                "  Peso: " + getPeso() + " kg\n" +
                "  Estado de Salud: " + getEstadoSalud() + "\n" +
                "  Vacunado: " + (isVacunado() ? "Sí" : "No") + "\n" +
                "  Esterilizado: " + (isEsteril() ? "Sí" : "No") + "\n" +
                "  Número de Patas: " + numeroPatas + "\n" +
                "  Tiene Alas: " + (tieneAlas ? "Sí" : "No") + "\n" +
                "  Tipo de Alimentación: " + alimentos + "\n" +
                "  Hábitat: " + habitat + "\n" +
                "  Es Beneficioso: " + (esBeneficioso ? "Sí" : "No");
    }

}