
package Ejercicio_1;

public class Nodo {
    
    private String nombre;
    private int codigo;
    private Nodo siguiente;

    public Nodo(String nombre, int codigo, Nodo siguiente) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
