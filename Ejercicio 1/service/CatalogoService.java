package service;

import inventario.InventarioService;
import model.Producto;

public class CatalogoService {
    private InventarioService inventario;

    public CatalogoService(InventarioService inventario) {
        this.inventario = inventario;
    }

    public Producto consultarProducto(String codigo) {
        return inventario.obtenerProducto(codigo);
    }
}
