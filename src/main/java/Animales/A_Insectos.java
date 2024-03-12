package Animales;

public class Insecto extends Animal {
    private int numeroPatas;
    private boolean tieneAlas;
    private String tipoAlimentacion;
    private String habitat;
    private boolean esBeneficioso;

    public Insecto(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
                   int numeroPatas, boolean tieneAlas, String tipoAlimentacion, String habitat, boolean esBeneficioso) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.numeroPatas = numeroPatas;
        this.tieneAlas = tieneAlas;
        this.tipoAlimentacion = tipoAlimentacion;
        this.habitat = habitat;
        this.esBeneficioso = esBeneficioso;
    }