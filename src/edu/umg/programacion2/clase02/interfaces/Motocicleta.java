package edu.umg.programacion2.clase02.interfaces;

/**
 * Una Motocicleta rinde 70 km por galón. A diferencia de Auto, aquí SÍ
 * sobreescribimos mostrarFicha(): un método default no es obligatorio,
 * pero cualquier clase puede reemplazarlo si necesita algo distinto.
 */
public class Motocicleta implements Vehiculo {

	private static final double KM_POR_GALON = 70.0;

	@Override
	public double calcularConsumoGalones(double kilometros) {
		return kilometros / KM_POR_GALON;
	}

	@Override
	public void mostrarFicha(double kilometros) {
		Vehiculo.super.mostrarFicha(kilometros);
		System.out.println("(Recuerda usar casco.)");
	}
}
