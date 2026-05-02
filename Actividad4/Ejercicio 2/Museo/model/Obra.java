package model;

import java.time.LocalDate;

public abstract class Obra {
    protected String autor;
    protected String periodo;
    protected double valor;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaIngreso;

    public Obra(String autor, String periodo, double valor,
                LocalDate fechaCreacion, LocalDate fechaIngreso) {
        this.autor = autor;
        this.periodo = periodo;
        this.valor = valor;
        this.fechaCreacion = fechaCreacion;
        this.fechaIngreso = fechaIngreso;
    }

    public double getValor() {
        return valor;
    }

    public String getAutor() {  
        return autor;
    }

}