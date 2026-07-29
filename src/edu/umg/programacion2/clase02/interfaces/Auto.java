package edu.umg.programacion2.clase02.interfaces;

/**
 * Un Auto rinde 40 km por galón. No necesita escribir mostrarFicha():
 * la hereda del método default de Vehiculo tal cual está.
 */
public class Auto implements Vehiculo {

	private static final double KM_POR_GALON = 40.0;

	@Override
	public double calcularConsumoGalones(double kilometros) {
		return kilometros / KM_POR_GALON;
	}
}
