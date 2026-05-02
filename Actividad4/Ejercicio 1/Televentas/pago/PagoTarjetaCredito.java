package pago;

public class PagoTarjetaCredito implements MetodoPago {

    private String numeroTarjeta;

    public PagoTarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con tarjeta" + this.numeroTarjeta + " por: " + monto);
    }
}
