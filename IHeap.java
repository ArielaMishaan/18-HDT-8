
/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Interfaz IHeap. Tomada del repositorio.
 */

/**
 * @author moises.alonso
 *
 */
public interface IHeap<P, V> {

	void Insert(P priority, V value);
	
	V get();
	
	V remove();
	
	int count();
	
	boolean isEmpty();
	
}
