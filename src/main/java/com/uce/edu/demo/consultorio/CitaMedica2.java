package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {

	private LocalDateTime fechaCita;

	//DI por metodos SET
	private Doctor doctor;// 3) a su metodo SET le pongo @Autowired
	private Paciente paciente;// a su metodo SET le pongo @Autowired

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaciente) {

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);

		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);

		// Seteamos los atributos de la cita medica
		this.fechaCita = fechaCita;

		// Se inserta la cita en la base de datos
		return "Cita agendada 2";
	}

	// SET Y GET

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
