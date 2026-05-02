package model;

import interfaces.Autenticable;

public class Usuario implements Autenticable {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }
}
