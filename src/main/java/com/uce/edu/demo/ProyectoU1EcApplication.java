package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	//1) DI por atributo
//	@Autowired
//	private CitaMedica cita;
	
	@Autowired
	private CitaMedica2 cita;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");

		String respuesta = this.cita.agendar(LocalDateTime.now(), "JAvier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta);

	}

}
