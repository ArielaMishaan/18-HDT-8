import java.util.ArrayList;
import java.util.PriorityQueue;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase CPU: clase controladora, usando el priority queue de JCF
 */

public class CpuJCF {
    private PriorityQueue<Proceso> procesos;
    private Comparador2 comparadorProcesos;


    public CpuJCF() {
        this.comparadorProcesos = new Comparador2();
        this.procesos = new PriorityQueue<Proceso>();
    }

    public CpuJCF(PriorityQueue<Proceso> procesos, Comparador2 comparadorProcesos) {
        this.procesos = procesos;
        this.comparadorProcesos = comparadorProcesos;
    }

    public void abrirArchivo(ArrayList<String> lineas) throws Exception{
        for (String linea : lineas) {
            
            String[] zapato = linea.split(",");

            String nombre = zapato[0];
            String usuario = zapato[1];
            int nice = Integer.valueOf(zapato[2]);
            int pr = 20 + nice + 100;
            Proceso proceso = new Proceso(nombre, usuario, nice, pr);

            procesos.add(proceso);
        }
    }

    public String indicarPrioridad(){

        String resultado = "\n Prioridad de los procesos:";
        
        for (int i = 0; i < procesos.size(); i++) {
            Proceso procesoTemporal = procesos.remove();
            resultado = resultado + procesoTemporal.toString();
        }
        return resultado;
    }


    public PriorityQueue<Proceso> getProcesos() {
        return this.procesos;
    }

    public void setProcesos(PriorityQueue<Proceso> procesos) {
        this.procesos = procesos;
    }

    public Comparador2 getComparadorProcesos() {
        return this.comparadorProcesos;
    }

    public void setComparadorProcesos(Comparador2 comparadorProcesos) {
        this.comparadorProcesos = comparadorProcesos;
    }




}
