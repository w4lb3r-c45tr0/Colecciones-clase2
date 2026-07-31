package edu.umg.programacion2.clase02.ejercicios.asistencia;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO (estudiante): completar registrarAsistencia().
 * <p>
 * Regla de negocio: cada carnet solo puede registrar asistencia una vez por
 * clase. El método debe indicar si el registro fue nuevo o si ya existía.
 * <p>
 * Pista: Set.add() ya retorna false cuando el elemento estaba repetido;
 * no necesitas combinar contains() + add().
 */
public class ControlAsistencia {

	private final Set<String> carnetsPresentes = new HashSet<>();

	public boolean registrarAsistencia(String carnet) {
		return carnetsPresentes.add(carnet);
	}

	public int totalPresentes() {
		return carnetsPresentes.size();
	}
}
