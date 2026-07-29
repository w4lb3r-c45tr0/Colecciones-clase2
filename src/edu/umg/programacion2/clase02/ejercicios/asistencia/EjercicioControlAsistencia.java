package edu.umg.programacion2.clase02.ejercicios.asistencia;

/**
 * Ejercicio de práctica 2: control de asistencia.
 * <p>
 * Enunciado: completa ControlAsistencia.registrarAsistencia() para que
 * detecte carnets duplicados usando un HashSet, sin necesitar contains().
 * <p>
 * Entrada de ejemplo: registrar "2024001", "2024002", "2024001" otra vez.
 * Salida esperada:
 * 2024001 -> registrado por primera vez: true
 * 2024002 -> registrado por primera vez: true
 * 2024001 -> registrado por primera vez: false (ya estaba presente)
 * <p>
 * Criterios de evaluación:
 * - registrarAsistencia() usa el valor de retorno de Set.add(), no un if
 *   con contains() por separado.
 * - totalPresentes() refleja solo carnets únicos.
 */
public class EjercicioControlAsistencia {

	public static void ejecutar() {
		System.out.println("=== Ejercicio de práctica: control de asistencia ===");

		ControlAsistencia control = new ControlAsistencia();
		String[] carnets = { "2024001", "2024002", "2024001" };

		try {
			for (String carnet : carnets) {
				boolean esNuevo = control.registrarAsistencia(carnet);
				System.out.println(carnet + " -> registrado por primera vez: " + esNuevo);
			}
			System.out.println("Total de estudiantes presentes: " + control.totalPresentes());
		} catch (UnsupportedOperationException ex) {
			System.out.println("Pendiente: " + ex.getMessage());
		}
	}
}
