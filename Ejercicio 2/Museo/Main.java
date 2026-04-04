import model.*;
import service.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Museo museo = new Museo();
        CatalogoService catalogo = new CatalogoService(museo);
        RestauracionService restauracionService = new RestauracionService();

        Cuadro cuadro = new Cuadro("Picasso", "Moderno", 5000,
                LocalDate.now(), LocalDate.now(),
                "Cubismo", "Óleo");

        museo.agregarObra(cuadro);

        Restauracion r = restauracionService.iniciarRestauracion("Limpieza");
        r.finalizar(LocalDate.now());

        System.out.println("Valor total: " + museo.calcularValorTotal());
        System.out.println("Obras en catálogo: " + catalogo.listarObras().size());
    }
}