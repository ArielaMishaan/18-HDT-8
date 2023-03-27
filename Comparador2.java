/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase Comparador Procesos: sirve para comparar dos procesos. Tomada del repositorio.
 */

public class Comparador2 {
    
    public int compareTo(Proceso proceso1, Proceso proceso2){
        int resultado = 0;

        if(proceso1.getPr() == proceso2.getPr()){
            resultado = 0;
        }
        else if(proceso1.getPr() < proceso2.getPr()){
            resultado = 1;
        }
        else{
            resultado = -1;
        }
        return resultado;
    }
}
