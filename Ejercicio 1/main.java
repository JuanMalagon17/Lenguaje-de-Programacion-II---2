import model.Producto;
import model.Cliente;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("P001", "Producto Demo", 100.0, 50);
        Cliente cliente = new Cliente("Juan", "juan@mail.com");

        System.out.println(producto.getDescripcion());
        System.out.println(cliente.getNombre());
    }
}
