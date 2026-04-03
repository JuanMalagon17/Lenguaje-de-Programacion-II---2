import model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cuadro cuadro = new Cuadro(
            "Picasso", "Moderno", 1000,
            LocalDate.now(), LocalDate.now(),
            "Cubismo", "Óleo"
        );

        System.out.println("Obra creada con valor: " + cuadro.getValor());
    }
}
