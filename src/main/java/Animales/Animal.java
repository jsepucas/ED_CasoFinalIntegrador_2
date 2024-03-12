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

    public Animal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }


    public boolean isEsteril() {
        return esteril;
    }

    public void setEsteril(boolean esteril) {
        this.esteril = esteril;
    }

    public abstract void alimentar();
    public abstract void realizarChequeoSalud();


}

