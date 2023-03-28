import java.util.ArrayList;
import java.util.PriorityQueue;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase CPU: clase controladora
 */

public class CPU {
    private VectorHeap procesosVectorHeap;
    private PriorityQueue procesosPQ;


    
    public CPU() {
        this.procesosVectorHeap = new VectorHeap<Proceso>();
        this.procesosPQ = new PriorityQueue<Proceso>();
    }

    public CPU(VectorHeap<Proceso> procesosVectorHeap, PriorityQueue procesosPQ) {
        this.procesosVectorHeap = procesosVectorHeap;
        this.procesosPQ = procesosPQ;
    }

    
    /** 
     * @param lineas
     * @throws Exception
     * Abre el archivo con la información y la guarda tanto en el heap implementado con vector, como en el implementado con Priority Queue de Java Collection Frameworks
     */
    public void abrirArchivo(ArrayList<String> lineas) throws Exception{
        for (String linea : lineas) {
            
            String[] zapato = linea.split(",");

            String nombre = zapato[0];
            String usuario = zapato[1];
            int nice = Integer.valueOf(zapato[2]);
            int pr = 20 + nice + 100;
            Proceso proceso = new Proceso(nombre, usuario, nice, pr);
            
            procesosVectorHeap.add(proceso);
            procesosPQ.add(proceso);
        }
    }

    /**
     * Ordena la información de los heaps (tanto el implementado con un vector como el implementado con la Priority Queue de Java Collection Frameworks)
     * @return String resultado con la información en el orden que se necesita
     */
    public String indicarPrioridad(){
        String resultado = "\nPrioridad de los procesos con un VectorHeap:";

        int cuenta = procesosVectorHeap.count();

        for (int i = 0; i < cuenta; i++) {
            resultado = resultado + procesosVectorHeap.remove().toString();
        }

        resultado = resultado + "\n\nPrioridad de los procesos con el Priority Queue de JCF:";

        for (int i = 0; i < cuenta; i++) {
            resultado = resultado + procesosPQ.remove().toString();
        }

        return resultado + "\n";
    }


    /**
     * Getter del heap implementado con vector
     * @return el heap implementado con vector
     */
    public VectorHeap getProcesosVectorHeap() {
        return this.procesosVectorHeap;
    }

    /**
     * Setter de heap implementado con vector
     * @param procesosVectorHeap
     */
    public void setProcesosVectorHeap(VectorHeap procesosVectorHeap) {
        this.procesosVectorHeap = procesosVectorHeap;
    }

    /**
     * Getter de heap implementado con priority queue de java collection frameworks
     * @return heap implementado con priority queue de java collection frameworks
     */
    public PriorityQueue getProcesosPQ() {
        return this.procesosPQ;
    }

    /**
     * Setter de heap implementado con priority queue de Java collection frameworks
     * @param procesosPQ
     */
    public void setProcesosPQ(PriorityQueue procesosPQ) {
        this.procesosPQ = procesosPQ;
    }



}
