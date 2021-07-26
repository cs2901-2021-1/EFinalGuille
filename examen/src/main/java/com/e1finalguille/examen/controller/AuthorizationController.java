package com.e1finalguille.examen.controller;

import com.e1finalguille.examen.entity.CentroVacuna;
import com.e1finalguille.examen.entity.Usuarios;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class AuthorizationController {
    static final Logger logger = Logger.getLogger(AuthorizationController.class.getName());

    private List<Usuarios> currentusers;
    private static AuthorizationController singleton = null;


    public void login() {
        logger.info("Iniciar Sesion");
        Scanner sc = new Scanner(System.in);
        logger.info("Usuario: ");
        String usuario = sc.nextLine();
        logger.info("Contraseña: ");
        String pass = sc.nextLine();
        if(!pass.equals(reversa(usuario)))
            logger.info("Mal logeo");
        else
            logger.info("buen logeo");
        Usuarios usuarioprueba = new Usuarios(usuario,pass);
        currentusers.add(usuarioprueba);

    }

    public String reversa(String aux){
        String inv ="";
        for (int i = aux.length() - 1; i >= 0; i--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            inv += aux.charAt(i);
        }
        return inv;
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
