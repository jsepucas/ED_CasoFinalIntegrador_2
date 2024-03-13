package Recursos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private List<Recursos> recursos;
    private Proveedor proveedor;
    private Date fecha;

    public Pedido(Proveedor proveedor) {
        this.proveedor = proveedor;
        this.fecha = new Date();
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(Recursos recurso) {
        recursos.add(recurso);
    }

    // Otros métodos para manipular el pedido
}