package edu.umg.programacion2.clase02.colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo: HashMap — búsqueda por clave en O(1).
 * <p>
 * En Prog 1, para encontrar un estudiante por carnet en un array había que
 * recorrerlo entero comparando uno por uno (O(n)). Con HashMap&lt;String,
 * Estudiante&gt; usando el carnet como clave, get() encuentra el estudiante
 * directamente, sin recorrer nada.
 */
public class DemoHashMap {

	public static void ejecutar() {
		System.out.println("=== HashMap: búsqueda por clave (carnet -> Estudiante) ===");

		Map<String, Estudiante> estudiantesPorCarnet = new HashMap<>();
		estudiantesPorCarnet.put("2024001", new Estudiante("Ana", "2024001"));
		estudiantesPorCarnet.put("2024002", new Estudiante("Luis", "2024002"));
		estudiantesPorCarnet.put("2024003", new Estudiante("Marta", "2024003"));

		// 1. Buscar por clave: directo, sin bucles.
		Estudiante encontrado = estudiantesPorCarnet.get("2024002");
		System.out.println("Buscar 2024002 -> " + encontrado);

		// 2. Si la clave no existe, get() retorna null (Cuidado: validar antes de usarlo).
		Estudiante noExiste = estudiantesPorCarnet.get("9999999");
		System.out.println("Buscar carnet inexistente -> " + noExiste);

		// 3. put() con una clave que ya existe REEMPLAZA el valor anterior.
		estudiantesPorCarnet.put("2024001", new Estudiante("Ana María", "2024001"));
		System.out.println("Después de actualizar 2024001 -> " + estudiantesPorCarnet.get("2024001"));

		System.out.println("Total de estudiantes registrados: " + estudiantesPorCarnet.size());
	}
}
