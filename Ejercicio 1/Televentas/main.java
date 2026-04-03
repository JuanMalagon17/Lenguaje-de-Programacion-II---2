import envio.*;
import inventario.InventarioService;
import model.*;
import pago.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        // Servicios
        InventarioService inventario = new InventarioService();
        CatalogoService catalogo = new CatalogoService(inventario);
        OrdenService ordenService = new OrdenService(inventario);
        QuejaService quejaService = new QuejaService();

        // Cliente
        Cliente cliente = new Cliente("Juan", "juan@mail.com");

        // Consulta producto
        Producto producto = catalogo.consultarProducto("P001");

        // Pago
        MetodoPago pago = new PagoTarjetaCredito("1234-5678");

        // Orden
        Orden orden = new Orden(pago);
        orden.agregarItem(new ItemOrden(producto, 2));

        // Procesar orden
        ordenService.procesarOrden(orden);

        // Envío
        EmpresaEnvio empresa = () -> System.out.println("Pedido enviado correctamente");
        Envio envio = new Envio(empresa);
        envio.gestionarEnvio();

        // Queja
        Queja queja = new Queja(cliente, "Demora en entrega");
        quejaService.enviarQueja(queja);

        System.out.println("Sistema ejecutado correctamente");
    }
}
