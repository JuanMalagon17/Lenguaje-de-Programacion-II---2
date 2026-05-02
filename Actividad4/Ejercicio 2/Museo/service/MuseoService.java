package service;

import model.Museo;

public class MuseoService {

    public double calcularValorTotal(Museo museo) {
        return museo.getObras()
                .stream()
                .mapToDouble(obra -> obra.getValor())
                .sum();
    }
}