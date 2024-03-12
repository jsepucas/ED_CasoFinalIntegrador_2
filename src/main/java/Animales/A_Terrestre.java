package Animales;

public class A_Terrestre extends Animal{

        private String tipoHabitat;
        private String modoLocomocion;
        private String dieta;

    public AnimalTerrestre(String nombre, int edad, double peso, String estadoSalud, boolean vacunado, boolean esteril,
                           String tipoHabitat, String modoLocomocion, String dieta) {
        super(nombre, edad, peso, estadoSalud, vacunado, esteril);
        this.tipoHabitat = tipoHabitat;
        this.modoLocomocion = modoLocomocion;
        this.dieta = dieta;


    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String getModoLocomocion() {
        return modoLocomocion;
    }


