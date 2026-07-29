package edu.umg.programacion2.clase02.interfaces;

/**
 * Contrato: "sabe calcular cuánto combustible consume".
 * <p>
 * Además del método abstracto (obligatorio), esta interface trae un método
 * "default": ya tiene una implementación lista, y cualquier clase que
 * implemente Vehiculo la recibe gratis, sin escribir una línea de código.
 * <p>
 * IMPORTANTE: los métodos default existen para poder agregar comportamiento
 * nuevo a una interface sin romper las clases que ya la implementaban antes
 * (por ejemplo, si Vehiculo llevaba 2 años en producción con 10 clases que
 * la implementan, agregar un método abstracto nuevo obligaría a modificar
 * las 10. Un método default no obliga a nada).
 */
public interface Vehiculo {

	double calcularConsumoGalones(double kilometros);

	// 1. Método default: tiene cuerpo propio dentro de la interface.
	default void mostrarFicha(double kilometros) {
		double consumo = calcularConsumoGalones(kilometros);
		System.out.printf("Para %.1f km este vehículo consume %.2f galones.%n", kilometros, consumo);
	}
}
