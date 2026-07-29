package edu.umg.programacion2.clase02.ejercicios.contactos;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO (estudiante): completar buscarPorNombre().
 * <p>
 * Regla de negocio: la agenda guarda un único contacto por nombre. Buscar
 * por nombre debe ser inmediato, sin recorrer nada (por eso usamos HashMap).
 * <p>
 * Pista: usa el método get() del Map interno.
 */
public class Agenda {

	private final Map<String, Contacto> contactos = new HashMap<>();

	public void agregar(Contacto contacto) {
		contactos.put(contacto.getNombre(), contacto);
	}

	public Contacto buscarPorNombre(String nombre) {
		// TODO: reemplazar esta línea por contactos.get(nombre).
		throw new UnsupportedOperationException("TODO: completar buscarPorNombre() en Agenda");
	}

	public int totalContactos() {
		return contactos.size();
	}
}
