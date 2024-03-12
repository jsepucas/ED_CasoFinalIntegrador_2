package Animales;

public class A_Acuaticos extends Animal{

    protected String tipoAgua;
    protected String metodoRespiracion;
    protected int profundidadPreferida;
    protected String dieta;


    public A_Acuaticos(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
                       String tipoAgua, String metodoRespiracion, int profundidadPreferida, String dieta) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.tipoAgua = tipoAgua;
        this.metodoRespiracion = metodoRespiracion;
        this.profundidadPreferida = profundidadPreferida;
        this.dieta = dieta;
    }
}
