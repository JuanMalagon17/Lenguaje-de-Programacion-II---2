import envio.*;
import inventario.InventarioService;
import model.*;
import pago.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        InventarioService inventario = new InventarioService();
        CatalogoService catalogo = new CatalogoService(inventario);

        Cliente cliente = new Cliente("Juan", "juan@mail.com");
        Producto producto = catalogo.consultarProducto("P001");

        MetodoPago pago = new PagoTarjetaCredito("1234");

        Orden orden = new Orden(pago);
        orden.agregarItem(new ItemOrden(producto, 2));

        OrdenService ordenService = new OrdenService(inventario);
        ordenService.procesarOrden(orden);

        // Simulación envío
        EmpresaEnvio empresa = () -> System.out.println("Enviando pedido...");
        Envio envio = new Envio(empresa);
        envio.gestionarEnvio();
    }
}
