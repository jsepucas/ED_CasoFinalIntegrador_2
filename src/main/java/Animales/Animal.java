package Animales;

public abstract class Animal {

    private String nombre;
    private int edad;
    private double peso;
    private String estadoSalud;
    private boolean vacunado;
    private boolean esteril;

    public Animal(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estadoSalud = estadoSalud;
        this.vacunado = vacunado;
        this.esteril = esteril;
    }


}
