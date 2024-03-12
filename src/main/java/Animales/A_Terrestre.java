package Animales;

public class A_Terrestre extends Animal{

    private String tipoHabitat;
    private String nivelActividad;
    private String tipoAlimentacion;
    private String dieta;

    public A_Terrestre(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril, String tipoHabitat, String nivelActividad, String tipoAlimentacion, String dieta) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.tipoHabitat = tipoHabitat;
        this.nivelActividad = nivelActividad;
        this.tipoAlimentacion = tipoAlimentacion;
        this.dieta = dieta;
    }

    public A_Terrestre(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
    }

    @Override
    public void alimentar() {

    }

    @Override
    public void realizarChequeoSalud() {

    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

public String getNivelActividad() {
        return nivelActividad;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

}


