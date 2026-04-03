package inventario;

import model.Producto;

public class InventarioService {

    public Producto obtenerProducto(String codigo) {
        // Simulación integración sistema externo
        return new Producto(codigo, "Producto Demo", 100.0, 50);
    }

    public void actualizarStock(Producto producto, int cantidad) {
        producto.reducirStock(cantidad);
    }
}
