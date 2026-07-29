package edu.umg.programacion2.clase02.colecciones;

import java.util.HashSet;
import java.util.Set;

/**
 * Demo: HashSet — garantía de unicidad, sin elementos repetidos.
 */
public class DemoHashSet {

	public static void ejecutar() {
		System.out.println("=== HashSet: carnets únicos ===");

		Set<String> carnetsRegistrados = new HashSet<>();
		boolean agregado1 = carnetsRegistrados.add("2024001");
		boolean agregado2 = carnetsRegistrados.add("2024002");
		boolean agregado3 = carnetsRegistrados.add("2024001"); // carnet repetido

		System.out.println("¿Se agregó 2024001 la primera vez? " + agregado1);
		System.out.println("¿Se agregó 2024002? " + agregado2);
		System.out.println("¿Se agregó 2024001 otra vez (duplicado)? " + agregado3);

		// IMPORTANTE: add() retorna false cuando el elemento ya existía en el
		// Set. Esto sirve para detectar duplicados sin necesitar contains()
		// seguido de add() por separado.
		System.out.println("Total de carnets únicos: " + carnetsRegistrados.size());
		System.out.println("Contenido del set: " + carnetsRegistrados);
	}
}
