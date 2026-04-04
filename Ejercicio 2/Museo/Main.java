import model.*;
import service.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== INICIO SISTEMA MUSEO ===");

        // Autenticación
        Usuario admin = new Usuario("admin", "1234");
        AutenticacionService authService = new AutenticacionService();

        if (!authService.autenticar(admin, "admin", "1234")) {
            System.out.println("Error de autenticación");
            return;
        }
        System.out.println("Usuario autenticado correctamente");

        // Servicios
        Museo museo = new Museo();
        CatalogoService catalogo = new CatalogoService(museo);
        RestauracionService restauracionService = new RestauracionService();
        MuseoService museoService = new MuseoService();

        // Crear obras
        Cuadro cuadro = new Cuadro(
                "Picasso", "Moderno", 5000,
                LocalDate.of(1937, 1, 1),
                LocalDate.now(),
                "Cubismo", "Óleo"
        );

        Escultura escultura = new Escultura(
                "Miguel Ángel", "Renacimiento", 8000,
                LocalDate.of(1504, 1, 1),
                LocalDate.now(),
                "Renacentista", "Mármol"
        );

        museo.agregarObra(cuadro);
        museo.agregarObra(escultura);

        System.out.println("Obras registradas: " + catalogo.listarObras().size());

        // Restauración
        System.out.println("Iniciando restauración para obra de: " + cuadro.getAutor());
        Restauracion restauracion = restauracionService.iniciarRestauracion("Limpieza profunda");
        restauracion.finalizar(LocalDate.now());

        System.out.println("Restauración finalizada");

        // Valor total
        double valorTotal = museoService.calcularValorTotal(museo);
        System.out.println("Valor total del museo: " + valorTotal);

        // Vista visitante
        System.out.println("\nListado de obras:");
        for (Obra obra : catalogo.listarObras()) {
            System.out.println("- Tipo: " + obra.getClass().getSimpleName()
                    + " | Autor: " + obra.getAutor()
                    + " | Valor: " + obra.getValor());
        }

        System.out.println("\n=== FIN DEL SISTEMA ===");
    }
}