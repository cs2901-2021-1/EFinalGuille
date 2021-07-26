package com.e1finalguille.examen.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CentroVacuna {
    static final Logger logger = Logger.getLogger(CentroVacuna.class.getName());
    Map<String, Integer> nombre= new HashMap<>();
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

    public void Porcentaje (){
        String cal="";
        cal = ("Introduce tu el rango edad para el %");

        if(cal==null)
                logger.info("No ingreso un rango valido");
        else{
            int calif=Integer.parseInt(cal);
            //Aqui se tomo el rango de 18 a 29 hasta 30 a 39, como indica la pregunta
            if(calif>=18&&calif<=39)
                logger.info("49.42%");
            else
            if(calif>=40&&calif<=49)
                logger.info("18.24%");
            else
            if(calif>=50&&calif<=59)
                logger.info("14.29%");
            else
            if(calif>=60&&calif<=69)
                logger.info("9.68%");
            else
            if(calif<70&&calif>=79)
                logger.info("5.55%");
            else
                //Mayores de 80
                logger.info("2.82%");
        }
    }








}

