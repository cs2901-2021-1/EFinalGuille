package com.e1finalguille.examen;


import com.e1finalguille.examen.entity.Usuarios;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExamenApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Logger.getLogger("Usuario: ");
		String usuario = sc.nextLine();
		Logger.getLogger("Contraseña: ");
		String pass = sc.nextLine();
		Usuarios prueba = new Usuarios(usuario);
		while(true){

		}

	}

}
