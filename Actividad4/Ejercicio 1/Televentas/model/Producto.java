package model;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;

    public Producto(String codigo, String descripcion, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getCantidadDisponible() { return cantidadDisponible; }

    public void reducirStock(int cantidad) {
        this.cantidadDisponible -= cantidad;
    }
}
