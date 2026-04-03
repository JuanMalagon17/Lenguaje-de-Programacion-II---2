package model;

import pago.MetodoPago;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<ItemOrden> items;
    private MetodoPago metodoPago;
    private boolean confirmada;

    public Orden(MetodoPago metodoPago) {
        this.items = new ArrayList<>();
        this.metodoPago = metodoPago;
        this.confirmada = false;
    }

    public void agregarItem(ItemOrden item) {
        items.add(item);
    }

    public double calcularTotal() {
        return items.stream().mapToDouble(ItemOrden::calcularSubtotal).sum();
    }

    public void confirmar() {
        metodoPago.procesarPago(calcularTotal());
        confirmada = true;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public List<ItemOrden> getItems() {
        return items;
    }
}
