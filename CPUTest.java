import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Pruebas Unitarias.
 */


class CPUTest {

	@Test
	void HeapTest() {
		HeapUsingIterativeBinaryTree<Integer, String> myHeap = new HeapUsingIterativeBinaryTree<Integer, String>(new ComparadorNumeros<Integer>());
		myHeap.Insert(20, "veinte");
		myHeap.Insert(10, "diez");
		myHeap.Insert(15, "quince");
		myHeap.Insert(5, "cinco");
		myHeap.Insert(10, "diez");
		
		assertEquals("cinco", myHeap.remove());
		assertEquals("diez", myHeap.remove());
		assertEquals("diez", myHeap.remove());
		assertEquals("quince", myHeap.remove());
		assertEquals("veinte", myHeap.remove());
	}

	@Test
	void abrirArchivoTest() throws Exception{
		CPU cpu = new CPU();
		ArrayList<String> lineas = new ArrayList<String>();

		lineas.add("vi,juan03,0");
		lineas.add("ls,maria30,-20");
		lineas.add("firefox,rosa20,5");
		lineas.add("cat,juan02,5");

		cpu.abrirArchivo(lineas);
		assertEquals(false, cpu.getProcesos().isEmpty());
	}

	@Test
	void indicarPrioridadTest() throws Exception{
		CPU cpu = new CPU();
		ArrayList<String> lineas = new ArrayList<String>();

		lineas.add("vi,juan03,0");
		lineas.add("ls,maria30,-20");
		lineas.add("firefox,rosa20,5");
		lineas.add("cat,juan02,5");

		cpu.abrirArchivo(lineas);

		String resultado = "\n Prioridad de los procesos:" + "\n\nnombre: ls\nusuario: maria30\nnice: -20\nPR: 100\n\nnombre: vi\nusuario: juan02\nnice: 0\nPR: 120\n\nnombre: firefox\nusuario: rosa20\nnice: 5\nPR: 125\n\nnombre: cat\nusuario: juan02\nnice: 5\nPR: 125";
		assertEquals(resultado, cpu.indicarPrioridad());
	}

}
