package edu.umg.programacion2.clase02.ejercicios.asistencia;

import java.util.HashSet;
import java.util.Set;


public class ControlAsistencia {

	private final Set<String> carnetsPresentes = new HashSet<>();

	public boolean registrarAsistencia(String carnet) {
		return carnetsPresentes.add(carnet);
	}

	public int totalPresentes() {
		return carnetsPresentes.size();
	}
}
