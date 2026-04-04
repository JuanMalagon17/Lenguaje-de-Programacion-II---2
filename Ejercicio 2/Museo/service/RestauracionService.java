package service;

import model.Restauracion;

import java.time.LocalDate;

public class RestauracionService {

    public Restauracion iniciarRestauracion(String tipo) {
        return new Restauracion(tipo, LocalDate.now());
    }
}
