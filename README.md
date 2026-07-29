# Clase 2 — Interfaces avanzadas + Colecciones (List, Map, Set)

Sábado 18 de julio de 2026.

## Cómo ejecutar

**Eclipse:** File > Import > Existing Projects into Workspace, seleccionar
esta carpeta. Ejecutar `Main.java` como Java Application.

**Terminal:**
```bash
cd src
javac -d ../bin edu/umg/programacion2/clase02/**/*.java edu/umg/programacion2/clase02/*.java
java -cp ../bin edu.umg.programacion2.clase02.Main
```

## Contenido

| Paquete | Qué muestra |
|---|---|
| `interfaces` | Métodos `default` en interfaces: `Vehiculo` con una implementación gratis (`Auto`) y una sobreescrita (`Motocicleta`) |
| `colecciones` | `ArrayList` (crece sola, vs. array fijo de Prog 1), `HashMap` (búsqueda por clave en O(1)) y `HashSet` (unicidad de elementos) |
| `catalogo` | Laboratorio en clase: catálogo de productos combinando las 3 colecciones, con menú interactivo |
| `ejercicios` | Ejercicios de práctica con `TODO` para completar en casa o en clase |

## Idea clave de la clase

- Un método **default** en una interface ya trae implementación: las clases
  que la implementan lo heredan gratis, pero pueden sobreescribirlo si
  necesitan otro comportamiento.
- Programamos siempre contra la **interface** (`List`, `Map`, `Set`), nunca
  contra la implementación concreta (`ArrayList`, `HashMap`, `HashSet`).
- **¿Cuándo usar cada colección?**

  | Colección | Úsala cuando... |
  |---|---|
  | `ArrayList` | Necesitas mantener orden y puede haber elementos repetidos (ej. catálogo completo) |
  | `HashMap` | Necesitas encontrar algo por una clave única al instante (ej. producto por código) |
  | `HashSet` | Solo te importa saber qué valores únicos existen, sin repetidos (ej. categorías) |

## Laboratorio en clase incluido

**Catálogo de productos** (`catalogo`): `ArrayList<Producto>` para el
catálogo completo, `HashMap<String, Producto>` para buscar por código y
`HashSet<String>` para las categorías sin repetir. Menú interactivo por
consola (opción 5 del `Main`).

## Ejercicios de práctica incluidos

1. **Agenda de contactos** (`ejercicios/contactos`): completar
   `Agenda.buscarPorNombre()` usando un `HashMap`.
2. **Control de asistencia** (`ejercicios/asistencia`): completar
   `ControlAsistencia.registrarAsistencia()` usando el valor de retorno de
   `Set.add()` para detectar carnets duplicados.

## Tarea para la siguiente clase

Completar `CatalogoProductos.buscarPorCategoria(String cat)` (paquete
`catalogo`) para que recorra el `ArrayList` y retorne solo los productos de
esa categoría. Se puede probar desde la opción 4 del menú del laboratorio
(`DemoCatalogoProductos`). Subir al repositorio.
