package model;

import java.util.ArrayList;
import java.util.List;

public class Museo {
    private List<Obra> obras = new ArrayList<>();

    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public double calcularValorTotal() {
        return obras.stream().mapToDouble(Obra::getValor).sum();
    }

    public List<Obra> getObras() {
        return obras;
    }
}