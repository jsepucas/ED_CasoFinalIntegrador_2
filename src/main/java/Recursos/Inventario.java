package Recursos;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<Recursos, Integer> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void agregarRecurso(Recursos recurso, int cantidad) {
        inventario.put(recurso, inventario.getOrDefault(recurso, 0) + cantidad);
    }

    public void eliminarRecurso(Recursos recurso, int cantidad) {
        int cantidadActual = inventario.getOrDefault(recurso, 0);
        if (cantidadActual >= cantidad) {
            inventario.put(recurso, cantidadActual - cantidad);
        } else {
            System.out.println("No hay suficiente cantidad de " + recurso.getNombre());
        }
    }

    // Otros métodos para manipular el inventario
}