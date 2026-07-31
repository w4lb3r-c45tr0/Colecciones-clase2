package edu.umg.programacion2.clase02.catalogo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Laboratorio en clase: catálogo de productos.
 * <p>
 * Una misma información, guardada de tres formas distintas según lo que
 * necesitamos hacer con ella:
 * - ArrayList&lt;Producto&gt;: mantener el catálogo completo en orden de llegada.
 * - HashMap&lt;String, Producto&gt;: encontrar un producto por código al instante.
 * - HashSet&lt;String&gt;: saber qué categorías existen, sin repetidas.
 */
public class CatalogoProductos {

	private final List<Producto> productos = new ArrayList<>();
	private final Map<String, Producto> productosPorCodigo = new HashMap<>();
	private final Set<String> categorias = new HashSet<>();

	public void agregar(Producto producto) {
		productos.add(producto);
		productosPorCodigo.put(producto.getCodigo(), producto);
		categorias.add(producto.getCategoria());
	}

	public Producto buscarPorCodigo(String codigo) {
		// ❌ Error común — comparar Strings con ==, casi siempre da false:
		// if (producto.getCodigo() == codigo) { ... }
		//
		// ✅ Solución correcta — usar equals() para comparar el CONTENIDO.
		// Aquí ni siquiera hace falta: el HashMap ya compara claves con
		// equals() internamente, por eso basta con get(codigo).
		return productosPorCodigo.get(codigo);
	}

	public Set<String> listarCategorias() {
		return categorias;
	}

	public List<Producto> listar() {
		return productos;
	}

	
	public List<Producto> buscarPorCategoria(String categoria) {
		
		List<Producto> resultado = new ArrayList<>();
		
		for (Producto producto : productos) {
			
			if (producto.getCategoria().equals(categoria)) {
				resultado.add(producto);
				}
			}
		return resultado;
	}
}
