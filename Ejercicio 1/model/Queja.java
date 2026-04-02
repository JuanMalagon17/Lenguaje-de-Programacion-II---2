package model;

public class Queja {
    private Cliente cliente;
    private String mensaje;

    public Queja(Cliente cliente, String mensaje) {
        this.cliente = cliente;
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
