package model;

import java.time.LocalDate;

public class Cuadro extends Obra {
    private String estilo;
    private String tecnica;

    public Cuadro(String autor, String periodo, double valor,
                  LocalDate fc, LocalDate fi,
                  String estilo, String tecnica) {
        super(autor, periodo, valor, fc, fi);
        this.estilo = estilo;
        this.tecnica = tecnica;
    }
}
