package edu.umg.programacion2.clase02;

import java.util.Scanner;

import edu.umg.programacion2.clase02.catalogo.DemoCatalogoProductos;
import edu.umg.programacion2.clase02.colecciones.DemoArrayList;
import edu.umg.programacion2.clase02.colecciones.DemoHashMap;
import edu.umg.programacion2.clase02.colecciones.DemoHashSet;
import edu.umg.programacion2.clase02.ejercicios.asistencia.EjercicioControlAsistencia;
import edu.umg.programacion2.clase02.ejercicios.contactos.EjercicioAgendaContactos;
import edu.umg.programacion2.clase02.interfaces.DemoMetodosDefault;

/**
 * Menú principal - Clase 2: interfaces avanzadas (default) + colecciones.
 */
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {
			mostrarMenu();
			String opcion = teclado.nextLine().trim();

			switch (opcion) {
			case "1":
				DemoMetodosDefault.ejecutar();
				break;
			case "2":
				DemoArrayList.ejecutar();
				break;
			case "3":
				DemoHashMap.ejecutar();
				break;
			case "4":
				DemoHashSet.ejecutar();
				break;
			case "5":
				DemoCatalogoProductos.ejecutar(teclado);
				break;
			case "6":
				EjercicioAgendaContactos.ejecutar();
				break;
			case "7":
				EjercicioControlAsistencia.ejecutar();
				break;
			case "0":
				salir = true;
				break;
			default:
				System.out.println("Opción no válida.");
			}
		}

		teclado.close();
		System.out.println("Fin del programa.");
	}

	private static void mostrarMenu() {
		System.out.println();
		System.out.println("=== Clase 2: Interfaces avanzadas + Colecciones ===");
		System.out.println("--- Interfaces avanzadas ---");
		System.out.println("1) Métodos default (Vehiculo: Auto + Motocicleta)");
		System.out.println("--- Colecciones ---");
		System.out.println("2) ArrayList vs. array estático");
		System.out.println("3) HashMap: búsqueda por clave");
		System.out.println("4) HashSet: unicidad de elementos");
		System.out.println("--- Laboratorio en clase ---");
		System.out.println("5) Catálogo de productos (ArrayList + HashMap + HashSet)");
		System.out.println("--- Ejercicios de práctica (con TODO) ---");
		System.out.println("6) Agenda de contactos (HashMap)");
		System.out.println("7) Control de asistencia (HashSet)");
		System.out.println("0) Salir");
		System.out.print("Opción: ");
	}
}
