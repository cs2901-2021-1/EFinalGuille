package com.e1finalguille.examen;


import com.e1finalguille.examen.controller.AuthorizationController;
import com.e1finalguille.examen.entity.Usuarios;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.logging.Logger;

@SpringBootApplication
public class ExamenApplication {
	static final Logger logger = Logger.getLogger(ExamenApplication.class.getName());


	public static void main(String[] args) {
		AuthorizationController start = new AuthorizationController();
		start.login();

	}

}
