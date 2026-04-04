package service;

import model.Usuario;

public class AutenticacionService {

    public boolean autenticar(Usuario usuario, String user, String pass) {
        return usuario.login(user, pass);
    }
}
