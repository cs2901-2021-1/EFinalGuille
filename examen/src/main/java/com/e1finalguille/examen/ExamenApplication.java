package com.e1finalguille.examen;


import com.e1finalguille.examen.controller.AuthorizationController;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExamenApplication {


	public static void main(String[] args) {
		AuthorizationController start = new AuthorizationController();
		start.login();

	}

}
