import java.util.ArrayList;
import java.util.Scanner;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Principal: interacción con el usuario
 */


public class Principal {
    
    public static void main(String[] args) {
        Archivo palabras = new Archivo("./procesos.txt");
        ArrayList<String> lineasPalabras = palabras.leerArchivo();

        CPU cpu = new CPU();
        System.out.println("hola");
        try {
            cpu.abrirArchivo(lineasPalabras);
            System.out.println(cpu.indicarPrioridad());

        } catch (Exception e) {
            System.out.println("\nEntrada inválida.");
            System.out.println();
    }

    }
}
