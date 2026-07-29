package edu.umg.programacion2.clase02.ejercicios.contactos;

public class Contacto {

	private final String nombre;
	private final String telefono;

	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return nombre + " -> " + telefono;
	}
}
