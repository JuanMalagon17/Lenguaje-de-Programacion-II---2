import model.*;
import pago.*;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("P001", "Producto Demo", 100.0, 50);

        MetodoPago pago = new PagoTarjetaCredito("1234");

        Orden orden = new Orden(pago);
        orden.agregarItem(new ItemOrden(producto, 2));

        orden.confirmar();
    }
} 
