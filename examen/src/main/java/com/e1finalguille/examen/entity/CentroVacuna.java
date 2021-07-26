package com.e1finalguille.examen.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CentroVacuna {
    Map<String, Integer> nombre= new HashMap<String, Integer>();
    private boolean estado; // false de baja / true de alta
    //Si se da de alta entonces podrá empezar a notificar automáticamente la  información de las personas que va vacunando.
    private String avance;
    private String cobertura;

    public CentroVacuna (){
        nombre.put("diecicochoaveintinueve",6303670);
        nombre.put("treintaatreintanueve", 5031117);
        nombre.put("cuarentaacuarentanueve", 4183174);
        nombre.put("cincuentaacincuentanueve", 3277134);
        nombre.put("sesentaasesentanueve", 2221241);
        nombre.put("setentaasetentanueve", 1271842);
        nombre.put("ochentaamas",647355);

    }
    public Map<String, Integer> getNombre() {
        return nombre;
    }

    public void setNombre(Map<String, Integer> nombre) {
        this.nombre = nombre;
    }

    public String getAvance() {
        return avance;
    }

    public void setAvance(String avance) {
        this.avance = avance;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }




}

