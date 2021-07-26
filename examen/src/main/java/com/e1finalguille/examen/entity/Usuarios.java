package com.e1finalguille.examen.entity;


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
    public void chagestatusofcentre(boolean valor, CentroVacuna cv){
        cv.setEstado(valor);
        notificar(cv);
    }
    public void notificar(CentroVacuna cv){
        logger.info("Una persona se vacuno en el centro de vacunacion con nombre:" + cv.getNombre());
    }





}
