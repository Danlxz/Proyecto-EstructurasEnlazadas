
package Ejercicio_3;

public class Doble_NodoC {
    
    private String nombre;
    private int codigo;
    private Doble_NodoC siguiente;
    private Doble_NodoC anterior;

    public Doble_NodoC(String nombre, int codigo, Doble_NodoC siguiente, Doble_NodoC anterior) {
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

    public Doble_NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Doble_NodoC siguiente) {
        this.siguiente = siguiente;
    }

    public Doble_NodoC getAnterior() {
        return anterior;
    }

    public void setAnterior(Doble_NodoC anterior) {
        this.anterior = anterior;
    }

}
