import java.util.ArrayList;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase CPU: clase controladora
 */

public class CPU {
    private HeapUsingIterativeBinaryTree<Integer, Proceso> procesos;
    private ComparadorNumeros comparadorNumeros;


    public CPU() {
        this.comparadorNumeros = new ComparadorNumeros<>();
        this.procesos = new HeapUsingIterativeBinaryTree<Integer, Proceso>(comparadorNumeros);
    }

    public CPU(HeapUsingIterativeBinaryTree<Integer,Proceso> procesos, ComparadorNumeros comparadorNumeros) {
        this.procesos = procesos;
        this.comparadorNumeros = comparadorNumeros;
    }

    public void abrirArchivo(ArrayList<String> lineas) throws Exception{
        for (String linea : lineas) {
            
            String[] zapato = linea.split(",");

            String nombre = zapato[0];
            String usuario = zapato[1];
            int nice = Integer.valueOf(zapato[2]);
            int pr = 20 + nice + 100;
            Proceso proceso = new Proceso(nombre, usuario, nice, pr);

            procesos.Insert(pr, proceso);
        }
    }

    public String indicarPriopirad(){
        String resultado = "\n Prioridad de los procesos:";
        for (int i = 0; i < procesos.count(); i++) {
            Proceso procesoTemporal = procesos.get();
            resultado = resultado + procesoTemporal.toString();
        }
        return resultado;
    }


    public HeapUsingIterativeBinaryTree<Integer,Proceso> getProcesos() {
        return this.procesos;
    }

    public void setProcesos(HeapUsingIterativeBinaryTree<Integer,Proceso> procesos) {
        this.procesos = procesos;
    }

    public ComparadorNumeros getComparadorNumeros() {
        return this.comparadorNumeros;
    }

    public void setComparadorNumeros(ComparadorNumeros comparadorNumeros) {
        this.comparadorNumeros = comparadorNumeros;
    }

    public CPU procesos(HeapUsingIterativeBinaryTree<Integer,Proceso> procesos) {
        setProcesos(procesos);
        return this;
    }

    public CPU comparadorNumeros(ComparadorNumeros comparadorNumeros) {
        setComparadorNumeros(comparadorNumeros);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " procesos='" + getProcesos() + "'" +
            ", comparadorNumeros='" + getComparadorNumeros() + "'" +
            "}";
    }



}
