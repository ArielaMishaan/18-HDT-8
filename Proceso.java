import java.util.Objects;

/*
 * Alina Carías (22539) y Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 8
 * 27-03-2023
 * Clase proceso: guarda cada uno de los procesos.
 */

public class Proceso implements Comparable{

    //Atributos
    private String nombre;
    private String usuario;
    private int nice;
    private int pr;


    //constructor sin parámetros
    public Proceso() {
        nombre = "";
        usuario = "";
        nice = 0;
        pr = 0;
    }

    //constructor con parámetros
    public Proceso(String nombre, String usuario, int nice, int pr) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nice = nice;
        this.pr = pr;
    }

//Sets y gets

    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    
    public String getUsuario() {
        return this.usuario;
    }

    
    /** 
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    /** 
     * @return int
     */
    public int getNice() {
        return this.nice;
    }

    
    /** 
     * @param nice
     */
    public void setNice(int nice) {
        this.nice = nice;
    }

    
    /** 
     * @return int
     */
    public int getPr() {
        return this.pr;
    }

    /**
     * 
     * @param pr
     */
    public void setPr(int pr) {
        this.pr = pr;
    }

    /**
     * 
     * @param nombre
     * @return
     */
    public Proceso nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    /**
     * 
     * @param usuario
     * @return
     */
    public Proceso usuario(String usuario) {
        setUsuario(usuario);
        return this;
    }

    /**
     * 
     * @param nice
     * @return
     */
    public Proceso nice(int nice) {
        setNice(nice);
        return this;
    }

    /**
     * 
     * @param pr
     * @return
     */
    public Proceso pr(int pr) {
        setPr(pr);
        return this;
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proceso)) {
            return false;
        }
        Proceso proceso = (Proceso) o;
        return Objects.equals(nombre, proceso.nombre) && Objects.equals(usuario, proceso.usuario) && nice == proceso.nice && pr == proceso.pr;
    }



    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return 
            "\n\nnombre: " + getNombre() + 
            "\nusuario: " + getUsuario() +
            "\nnice: " + getNice() +
            "\nPR: " + getPr();
    }


    
    /** 
     * @param o
     * @return int
     * comparador de procesos
     */
    @Override
    public int compareTo(Object o) {
        int resultado = 0;

        if(this.getPr() == ((Proceso) o).getPr()){
            resultado = 0;
        }
        else if(this.getPr() > ((Proceso) o).getPr()){
            resultado = 1;
        }
        else{
            resultado = -1;
        }
        return resultado; 
    }
    
}
