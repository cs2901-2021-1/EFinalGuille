package com.e1finalguille.examen.entity;

import com.e1finalguille.examen.controller.AuthorizationController;

import java.util.logging.Logger;

public class Usuarios {
    static final Logger logger = Logger.getLogger(Usuarios.class.getName());


    private String username;
    private String password;

    public Usuarios(String usuario) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuarios(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void chagestatusofcentre(boolean valor, CentroVacuna CV){
        CV.setEstado(valor);
        notificar(CV);
    }
    public void notificar(CentroVacuna CV){
        logger.info("Una persona se vacuno en el centro de vacunacion con nombre:" + CV.getNombre());
    }


/*
    public void notificar(CentroVacuna CV)
    {
        if (CV.isEstado())
        {
            int random = (int)Math.floor(Math.random() * CV.getNombre());
            Logger.getLogger("Estamos vacunando a " + x[random]);
        }
*/



}
