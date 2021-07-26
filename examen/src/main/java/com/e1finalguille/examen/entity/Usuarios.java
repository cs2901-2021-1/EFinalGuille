package com.e1finalguille.examen.entity;

import com.e1finalguille.examen.controller.AuthorizationController;

public class Usuarios {

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

    public void setPassword(String username) {
        String inv = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            inv += username.charAt(i);
        }
        this.password = inv;
    }

    public void chagestatusofcentre(boolean valor,CentroVacuna CV){
        CV.setEstado(valor);
        notificar(CV);
    }

    public String isLogeado() {
        return AuthorizationController.getSingleton().login(username,password);
    }


    public void notificar(CentroVacuna CV)
    {
        if (CV.isEstado())
        {
            int random = (int)Math.floor(Math.random() * CV.getNombre());
            Logger.getLogger("Estamos vacunando a " + x[random]);
        }




}
