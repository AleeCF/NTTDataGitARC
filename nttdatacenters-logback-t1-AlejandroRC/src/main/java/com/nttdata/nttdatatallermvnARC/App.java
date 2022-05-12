package com.nttdata.nttdatatallermvnARC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alejandro Rebola
 *
 */
public class App {
	public static void main(String[] args) {

		// Llamada a la clase Logger
		Logger logger = LoggerFactory.getLogger(App.class);

		// Se realizara un bucle for para rellenar los ficheros que se generaran a
		// continuación.
		for (int i = 0; i < 4000; i++) {
			logger.info("Iteración  {}", i, App.class.getSimpleName());
		}
		// Mensaje Logback para finalizar.
		logger.warn("El proceso ha Finalizado");
	}
}
