package Animales;

public class A_Acuaticos extends Animal{

    protected String tipoAgua;
    protected String metodoRespiracion;
    protected int profundidadPreferida;
    protected String dieta;


    public A_Acuaticos(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril, String tipoAgua, String metodoRespiracion, int profundidadPreferida, String dieta) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril); // Llamar al constructor de la clase padre con los parámetros adecuados
        this.tipoAgua = tipoAgua;
        this.metodoRespiracion = metodoRespiracion;
        this.profundidadPreferida = profundidadPreferida;
        this.dieta = dieta;
    }

    public A_Acuaticos(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril) {
    }

    public A_Acuaticos() {

    }

    @Override
    public void alimentar() {
        
    }

    @Override
    public void realizarChequeoSalud() {
    }
    @Override
    public String toString() {
        return "Animal Acuático:\n" +
                "  Nombre: " + getNombre() + "\n" +
                "  Edad: " + getEdad() + "\n" +
                "  Peso: " + getPeso() + " kg\n" +
                "  Estado de Salud: " + getEstadoSalud() + "\n" +
                "  Vacunado: " + (isVacunado() ? "Sí" : "No") + "\n" +
                "  Esterilizado: " + (isEsteril() ? "Sí" : "No") + "\n" +
                "  Tipo de Agua: " + tipoAgua + "\n" +
                "  Método de Respiración: " + metodoRespiracion + "\n" +
                "  Profundidad Preferida: " + profundidadPreferida + " metros\n" +
                "  Dieta: " + dieta;
    }

}




