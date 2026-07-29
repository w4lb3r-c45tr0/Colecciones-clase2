package edu.umg.programacion2.clase02.colecciones;

/**
 * Clase simple reutilizada en los demos de HashMap y HashSet.
 */
public class Estudiante {

	private final String nombre;
	private final String carnet;

	public Estudiante(String nombre, String carnet) {
		this.nombre = nombre;
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCarnet() {
		return carnet;
	}

	@Override
	public String toString() {
		return nombre + " (carnet " + carnet + ")";
	}
}
