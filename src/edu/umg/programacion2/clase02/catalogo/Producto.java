package edu.umg.programacion2.clase02.catalogo;

/**
 * Reutiliza lo ya conocido de Prog 1: encapsulamiento con getters/setters.
 */
public class Producto {

	private final String codigo;
	private final String nombre;
	private final double precio;
	private final String categoria;

	public Producto(String codigo, String nombre, double precio, String categoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return String.format("[%s] %s - Q%.2f (%s)", codigo, nombre, precio, categoria);
	}
}
