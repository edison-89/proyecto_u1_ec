package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

@Component
public class Paciente {
	private String nombre;
	private int edad;

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
