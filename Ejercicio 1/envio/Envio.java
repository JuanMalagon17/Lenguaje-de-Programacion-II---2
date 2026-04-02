package envio;

public class Envio {
    private EmpresaEnvio empresa;

    public Envio(EmpresaEnvio empresa) {
        this.empresa = empresa;
    }

    public void gestionarEnvio() {
        empresa.enviarPedido();
    }
}
