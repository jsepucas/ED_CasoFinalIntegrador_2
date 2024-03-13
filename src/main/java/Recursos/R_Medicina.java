package Recursos;

import java.util.Date;

public class R_Medicina extends Recursos {
    private String tipoMedicina;
    private String dosis;

    public R_Medicina(String nombre, int cantidad, Date fechaCaducidad) {
        super(nombre, cantidad, fechaCaducidad);
    }

    public void R_Medicina(String nombre, int cantidad, Date fechaCaducidad, String tipoMedicina, String dosis) {
        super(nombre, cantidad, fechaCaducidad);
        this.tipoMedicina = tipoMedicina;
        this.dosis = dosis;
    }


    // Getters y setters
    public String getTipoMedicina() {
        return tipoMedicina;
    }

    public void setTipoMedicina(String tipoMedicina) {
        this.tipoMedicina = tipoMedicina;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @Override
    public void describir() {
        System.out.println("Tipo de medicina: " + tipoMedicina + ", Dosis recomendada: " + dosis);
    }
}

