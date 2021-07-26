package com.e1finalguille.examen.controller;

import com.e1finalguille.examen.entity.Usuarios;

import java.util.List;

public class AuthorizationController {
    private List<String> currentusers;
    private static AuthorizationController singleton = null;


    public String login(String username, String pass) {
        if(!currentusers.contains(username))
            return "logueado";
        return username;
    }
    public static AuthorizationController getSingleton()
    {
        if (singleton == null)
            singleton = new AuthorizationController();
        return singleton;
    }

    public boolean logout(Usuarios usuario) {
        return currentusers.remove(usuario);
    }
}
