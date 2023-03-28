/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Interfaz PriorityQueue, tomada del repositorio de la clase.
 */


public interface PriorityQueue<T> {
    
    void add(T t);
	
	T getFirst();
	
	T remove();
	
	int count();
	
	boolean isEmpty();
}
