package edu.umg.programacion2.clase02.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo: interfaces con método default.
 * <p>
 * 1. La lista es de tipo Vehiculo, no de Auto ni Motocicleta (polimorfismo,
 * lo mismo que ya vimos en la Clase 1 con Pagable).
 * 2. Auto usa mostrarFicha() tal como viene en la interface.
 * 3. Motocicleta la sobreescribe y le agrega un mensaje extra, pero sigue
 * llamando la versión original con Vehiculo.super.mostrarFicha(...).
 */
public class DemoMetodosDefault {

	public static void ejecutar() {
		System.out.println("=== Interfaces con método default ===");

		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Auto());
		vehiculos.add(new Motocicleta());

		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.getClass().getSimpleName() + ":");
			vehiculo.mostrarFicha(150);
			System.out.println();
		}
	}
}
