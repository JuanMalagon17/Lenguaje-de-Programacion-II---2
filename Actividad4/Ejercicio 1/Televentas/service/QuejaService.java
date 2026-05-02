package service;

import model.Queja;

public class QuejaService {

    public void enviarQueja(Queja queja) {
        System.out.println("Queja enviada al gerente: " + queja.getMensaje());
    }
}
