import model.*;
import service.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Museo museo = new Museo();
        CatalogoService catalogo = new CatalogoService(museo);

        Cuadro c = new Cuadro("Picasso", "Moderno", 2000,
                LocalDate.now(), LocalDate.now(),
                "Cubismo", "Óleo");

        museo.agregarObra(c);

        System.out.println("Obras en catálogo: " + catalogo.listarObras().size());
    }
}