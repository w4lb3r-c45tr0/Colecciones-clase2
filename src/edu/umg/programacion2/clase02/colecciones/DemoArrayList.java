package edu.umg.programacion2.clase02.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo: ArrayList — qué resuelve frente al array de tamaño fijo de Prog 1.
 */
public class DemoArrayList {

	public static void ejecutar() {
		System.out.println("=== ArrayList: qué resuelve vs. array estático ===");

		// 1. El array de Prog 1: tamaño fijo, definido al crearlo.
		String[] estudiantesArray = new String[3];
		estudiantesArray[0] = "Ana";
		estudiantesArray[1] = "Luis";
		estudiantesArray[2] = "Marta";
		// Cuidado: si llega un cuarto estudiante, este array ya no tiene
		// espacio. Habría que crear uno nuevo más grande y copiar todo.
		// estudiantesArray[3] = "Diego"; // ArrayIndexOutOfBoundsException

		// 2. IMPORTANTE: programamos contra la interface List, no contra
		// ArrayList directamente. Así, si mañana cambiamos la implementación
		// (por ejemplo a LinkedList), el resto del código no se entera.
		List<String> estudiantesLista = new ArrayList<>();
		estudiantesLista.add("Ana");
		estudiantesLista.add("Luis");
		estudiantesLista.add("Marta");
		estudiantesLista.add("Diego"); // la lista crece sola, sin errores

		System.out.println("Lista completa: " + estudiantesLista);
		System.out.println("Tamaño: " + estudiantesLista.size());
		System.out.println("¿Contiene a Luis? " + estudiantesLista.contains("Luis"));

		estudiantesLista.remove("Luis");
		System.out.println("Después de remove(\"Luis\"): " + estudiantesLista);

		String primero = estudiantesLista.get(0);
		System.out.println("Elemento en la posición 0: " + primero);
	}
}
