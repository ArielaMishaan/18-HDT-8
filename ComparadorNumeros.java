import java.util.Comparator;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase Comparador Números: sirve para comparar dos números. Tomada del repositorio.
 */

/**
 * @author moises.alonso
 */
public class ComparadorNumeros<Integer> implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if ((int)o1 == (int)o2)
			return 0;
		else if ((int)o1 > (int)o2)
			return 1;
		else 
			return -1;
	}

}
