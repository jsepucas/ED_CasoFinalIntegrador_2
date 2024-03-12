package Animales;

public class A_Aviarios extends A_Acuaticos{

    private String tipoPlumaje;
    private boolean esCapazDeVolar;
    private String dieta;

    private String habitatPreferido;
    private boolean esMigratoria;


    public Ave(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
               String tipoPlumaje, boolean esCapazDeVolar, String dieta, String habitatPreferido, boolean esMigratoria) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.tipoPlumaje = tipoPlumaje;
        this.esCapazDeVolar = esCapazDeVolar;
        this.dieta = dieta;
        this.habitatPreferido = habitatPreferido;
        this.esMigratoria = esMigratoria;
    }
}

