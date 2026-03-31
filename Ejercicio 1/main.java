import model.*;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("P001", "Producto Demo", 100.0, 50);

        Orden orden = new Orden(null);
        orden.agregarItem(new ItemOrden(producto, 2));

        System.out.println("Total: " + orden.calcularTotal());
    }
}
