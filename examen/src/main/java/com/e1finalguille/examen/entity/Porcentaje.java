package com.e1finalguille.examen.entity;

import javax.swing.*;

public class Porcentaje {

    public static void main(String args[]){

        String cal="";
        cal = JOptionPane.showInputDialog("Introduce tu el rango edad para el %");

        if(cal==null)
            System.out.println("No ingreso un rango valido");
        else{
            int calif=Integer.parseInt(cal);
            //Aqui se tomo el rango de 18 a 29 hasta 30 a 39, como indica la pregunta
            if(calif>=18&&calif<=39)
                System.out.println("49.42%");
            else
            if(calif>=40&&calif<=49)
                System.out.println("18.24%");
            else
            if(calif>=50&&calif<=59)
                System.out.println("14.29%");
            else
            if(calif>=60&&calif<=69)
                System.out.println("9.68%");
            else
            if(calif<70&&calif>=79)
                System.out.println("5.55%");
            else
                //Mayores de 80
                System.out.println("2.82%");
        }
    }
}
