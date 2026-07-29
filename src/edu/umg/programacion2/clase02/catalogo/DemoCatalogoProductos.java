package edu.umg.programacion2.clase02.catalogo;

import java.util.List;
import java.util.Scanner;

/**
 * Menú interactivo del laboratorio: agregar, buscar por código, listar
 * categorías únicas y (cuando esté completo) listar por categoría.
 */
public class DemoCatalogoProductos {

	public static void ejecutar(Scanner teclado) {
		System.out.println("=== Laboratorio: catálogo de productos ===");

		CatalogoProductos catalogo = cargarCatalogoDeEjemplo();
		boolean salir = false;

		while (!salir) {
			mostrarMenu();
			String opcion = teclado.nextLine().trim();

			switch (opcion) {
			case "1":
				agregarProducto(catalogo, teclado);
				break;
			case "2":
				buscarPorCodigo(catalogo, teclado);
				break;
			case "3":
				System.out.println("Categorías registradas: " + catalogo.listarCategorias());
				break;
			case "4":
				listarPorCategoria(catalogo, teclado);
				break;
			case "5":
				catalogo.listar().forEach(System.out::println);
				break;
			case "0":
				salir = true;
				break;
			default:
				System.out.println("Opción no válida.");
			}
		}
	}

	private static CatalogoProductos cargarCatalogoDeEjemplo() {
		CatalogoProductos catalogo = new CatalogoProductos();
		catalogo.agregar(new Producto("P001", "Coca-Cola 600ml", 8.50, "Bebidas"));
		catalogo.agregar(new Producto("P002", "Agua pura 600ml", 5.00, "Bebidas"));
		catalogo.agregar(new Producto("P003", "Sandwich de pollo", 25.00, "Comida"));
		catalogo.agregar(new Producto("P004", "Papas fritas", 12.00, "Snacks"));
		return catalogo;
	}

	private static void agregarProducto(CatalogoProductos catalogo, Scanner teclado) {
		System.out.print("Código: ");
		String codigo = teclado.nextLine().trim();
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine().trim();
		System.out.print("Precio: ");
		double precio = Double.parseDouble(teclado.nextLine().trim());
		System.out.print("Categoría: ");
		String categoria = teclado.nextLine().trim();

		catalogo.agregar(new Producto(codigo, nombre, precio, categoria));
		System.out.println("Producto agregado.");
	}

	private static void buscarPorCodigo(CatalogoProductos catalogo, Scanner teclado) {
		System.out.print("Código a buscar: ");
		String codigo = teclado.nextLine().trim();
		Producto encontrado = catalogo.buscarPorCodigo(codigo);
		System.out.println(encontrado != null ? encontrado : "No existe un producto con ese código.");
	}

	private static void listarPorCategoria(CatalogoProductos catalogo, Scanner teclado) {
		System.out.print("Categoría a listar: ");
		String categoria = teclado.nextLine().trim();
		try {
			List<Producto> productos = catalogo.buscarPorCategoria(categoria);
			productos.forEach(System.out::println);
		} catch (UnsupportedOperationException ex) {
			System.out.println("Pendiente: " + ex.getMessage());
		}
	}

	private static void mostrarMenu() {
		System.out.println();
		System.out.println("--- Catálogo de productos ---");
		System.out.println("1) Agregar producto");
		System.out.println("2) Buscar por código");
		System.out.println("3) Listar categorías únicas");
		System.out.println("4) Listar por categoría (TODO de la tarea)");
		System.out.println("5) Listar todo el catálogo");
		System.out.println("0) Volver al menú principal");
		System.out.print("Opción: ");
	}
}
