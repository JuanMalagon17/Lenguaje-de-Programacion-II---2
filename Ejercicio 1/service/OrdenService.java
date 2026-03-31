package service;

import inventario.InventarioService;
import model.ItemOrden;
import model.Orden;

public class OrdenService {
    private InventarioService inventario;

    public OrdenService(InventarioService inventario) {
        this.inventario = inventario;
    }

    public void procesarOrden(Orden orden) {
        orden.confirmar();

        for (ItemOrden item : orden.getItems()) {
            inventario.actualizarStock(item.getProducto(), item.getCantidad());
        }
    }
}
