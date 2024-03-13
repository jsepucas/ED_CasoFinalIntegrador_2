package Recursos;

import java.util.Date;
import java.util.List;

public class R_Alimentos extends Recursos {
    private String tipoAlimento;
    private List<String> nutrientes;

    public R_Alimentos(String nombre, int cantidad, Date fechaCaducidad, String tipoAlimento, List<String> nutrientes) {
        super(nombre, cantidad, fechaCaducidad);
        this.tipoAlimento = tipoAlimento;
        this.nutrientes = nutrientes;
    }

    // Getters y setters
    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public List<String> getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(List<String> nutrientes) {
        this.nutrientes = nutrientes;
    }

    @Override
    public void describir() {
        System.out.println("Tipo de alimento: " + tipoAlimento + ", Nutrientes principales: " + nutrientes);
    }
}
