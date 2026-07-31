package edu.umg.programacion2.clase02.ejercicios.contactos;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

	private final Map<String, Contacto> contactos = new HashMap<>();

	public void agregar(Contacto contacto) {
		contactos.put(contacto.getNombre(), contacto);
	}

	public Contacto buscarPorNombre(String nombre) {
		return contactos.get(nombre);
	}

	public int totalContactos() {
		return contactos.size();
	}
}
