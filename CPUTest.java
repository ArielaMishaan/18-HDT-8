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
	void VectorHeapTestRemoveAdd() {
		VectorHeap<Integer> myHeap = new VectorHeap<Integer>();
		myHeap.add(20);
		myHeap.add(10);
		myHeap.add(15);
		myHeap.add(5);
		myHeap.add(10);
		
		assertEquals(5, myHeap.remove());
		assertEquals(10, myHeap.remove());
		assertEquals(10, myHeap.remove());
		assertEquals(15, myHeap.remove());
		assertEquals(20, myHeap.remove());
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
		assertEquals(false, cpu.getProcesosVectorHeap().isEmpty());
		assertEquals(false, cpu.getProcesosPQ().isEmpty());
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

		String resultado = "\nPrioridad de los procesos con un VectorHeap:" + "\n\nnombre: ls\nusuario: maria30\nnice: -20\nPR: 100\n\nnombre: vi\nusuario: juan03\nnice: 0\nPR: 120\n\nnombre: firefox\nusuario: rosa20\nnice: 5\nPR: 125\n\nnombre: cat\nusuario: juan02\nnice: 5\nPR: 125\n" ;
		resultado = resultado + "\nPrioridad de los procesos con el Priority Queue de JCF:\n\nnombre: ls\nusuario: maria30\nnice: -20\nPR: 100\n\nnombre: vi\nusuario: juan03\nnice: 0\nPR: 120\n\nnombre: firefox\nusuario: rosa20\nnice: 5\nPR: 125\n\nnombre: cat\nusuario: juan02\nnice: 5\nPR: 125\n";
		assertEquals(resultado, cpu.indicarPrioridad());
	}

}
