
package Ejercicio_2;

public class Doble_Nodo {
    
    private String nombre;
    private int codigo;
    private Doble_Nodo siguiente;
    private Doble_Nodo anterior;

    public Doble_Nodo(String nombre, int codigo, Doble_Nodo siguiente, Doble_Nodo anterior) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.siguiente = siguiente;
        this.anterior = anterior;
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

    public Doble_Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Doble_Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Doble_Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Doble_Nodo anterior) {
        this.anterior = anterior;
    }

}
