package edu.umg.programacion2.clase02.ejercicios.contactos;

/**
 * Ejercicio de práctica 1: agenda de contactos.
 * <p>
 * Enunciado: completa Agenda.buscarPorNombre() para que encuentre un
 * contacto por su nombre usando el HashMap interno, sin recorrer nada.
 * <p>
 * Entrada de ejemplo: Agenda con "Ana" y "Luis" registrados, buscar "Luis".
 * Salida esperada: Luis -> 5555-5678
 * <p>
 * Criterios de evaluación:
 * - buscarPorNombre() usa contactos.get(nombre), no un bucle for.
 * - Si el nombre no existe, retorna null (no lanza excepción propia).
 */
public class EjercicioAgendaContactos {

	public static void ejecutar() {
		System.out.println("=== Ejercicio de práctica: agenda de contactos ===");

		Agenda agenda = new Agenda();
		agenda.agregar(new Contacto("Ana", "5555-1234"));
		agenda.agregar(new Contacto("Luis", "5555-5678"));
		System.out.println("Total de contactos: " + agenda.totalContactos());

		try {
			Contacto encontrado = agenda.buscarPorNombre("Luis");
			System.out.println("Buscar \"Luis\" -> " + encontrado);
		} catch (UnsupportedOperationException ex) {
			System.out.println("Pendiente: " + ex.getMessage());
		}
	}
}
