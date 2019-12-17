
package Ejercicio_3;

import static Ejercicio_3.Interfaz_3.opciones_3;
import static Ejercicio_3.Interfaz_3.tabla_3;
import static Ejercicio_3.Interfaz_3.txt_3;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Estructuras_DoblesC {
    
    private Doble_NodoC cabeza;
    private Doble_NodoC cola;
    private int numElement;

    public Estructuras_DoblesC() {
        cabeza = cola = null;
        numElement = 0;
    }
    
    public boolean EstaVacia (){
        return (cabeza == null && cola == null);
    }
    
    public int numElementos() {
        return (numElement);
    }
    
    // ----- METODOS DE INSERCION ----- //
    
    public void InsertarInicio (Doble_NodoC nuevo){
        if (EstaVacia()) {
            cabeza = cola = nuevo;
            cabeza.setSiguiente(cola);
            cabeza.setAnterior(cola);
            cola.setSiguiente(cabeza);
            cola.setAnterior(cabeza);
        }else{
            nuevo.setSiguiente(cabeza);
            nuevo.setAnterior(cola);
            cabeza.setAnterior(nuevo);
            cola.setSiguiente(nuevo);
            cabeza = nuevo;
        }
        numElement++;
    }
    
    public void InsertarFinal (Doble_NodoC nuevo){
        if (EstaVacia()) {
            cabeza = cola = nuevo;
            cabeza.setSiguiente(cola);
            cabeza.setAnterior(cola);
            cola.setSiguiente(cabeza);
            cola.setAnterior(cabeza);
        }else{
            cola.setSiguiente(nuevo);
            cabeza.setAnterior(nuevo);
            nuevo.setSiguiente(cabeza);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        numElement++;
    }
    
    public void InsertarPosicion (int posicion, Doble_NodoC nuevo){
        Doble_NodoC aux = cabeza;
        if (posicion >= 0 && posicion < numElement) {
            if (posicion == 0) {
                nuevo.setSiguiente(cabeza);
                nuevo.setAnterior(cola);
                cabeza.setAnterior(nuevo);
                cola.setSiguiente(nuevo);
                cabeza = nuevo;
            }else{
                for (int i = 0; i < (posicion - 1); i++) {
                    aux = aux.getSiguiente();
                }
                Doble_NodoC sigue = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(sigue);
                Doble_NodoC ante = aux.getAnterior();
                aux.setAnterior(nuevo);
                nuevo.setAnterior(ante);
            }
            numElement++;
        }else{
            JOptionPane.showMessageDialog(null, "ESTA POSICION NO EXISTE EN LA LISTA");
        }
    }
    
    // ----- METODO DE ELIMINACION ----- //
    
    public void EliminarIncio (){
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        }else{
            if (cabeza == cola && numElement == 1) {
                cabeza = cola = null;
            }else{
                Doble_NodoC aux = cabeza.getSiguiente();
                aux.setAnterior(cola);
                cola.setSiguiente(aux);
                cabeza = aux;
            }
            numElement--;
        }
    }
    
    public void EliminarFinal (){
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        }else{
            if (cabeza == cola && numElement == 1) {
                cabeza = cola = null;
            }else{
                Doble_NodoC aux = cola.getAnterior();
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cola = aux;
            
            }
            numElement--;
        }
    }
    
    public void EliminarDato (String nom, int cod){
        Doble_NodoC recorrer = cabeza.getSiguiente();
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        }else{
            if (cabeza.getNombre().equals(nom) && cabeza.getCodigo() == cod) {
                if (cola.getNombre().equals(nom) && cola.getCodigo() == cod && numElement == 1) {
                    cabeza = cola = null;
                    numElement--;
                }else{
                    Doble_NodoC aux = cabeza.getSiguiente();
                    aux.setAnterior(cola);
                    cola.setSiguiente(aux);
                    cabeza = aux;
                    numElement--;
                }
            }else if (cola.getNombre().equals(nom) && cola.getCodigo() == cod) {
                Doble_NodoC aux = cola.getAnterior();
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cola = aux;
                numElement--;
            }else{
                if (Buscar(nom, cod) == false) {
                    JOptionPane.showMessageDialog(null, "< ESTE ELEMENTO NO EXISTE EN LA LISTA >");
                }
                do {                
                    if (recorrer.getNombre().equals(nom) && recorrer.getCodigo() == cod) {
                        Doble_NodoC ante = recorrer.getAnterior();
                        Doble_NodoC sigue = recorrer.getSiguiente();
                        ante.setSiguiente(sigue);
                        sigue.setAnterior(ante);
                        numElement--;
                    }
                    recorrer = recorrer.getSiguiente();
                } while (recorrer != cabeza);
            }
        }
    }
    
    public void EliminarPosicion (int pos){
        Doble_NodoC recorrer = cabeza;
        if (pos >= 0 && pos < numElement) {
            if (pos == 0) {
                if (numElement == 1) {
                    cabeza = cola = null;
                }else{
                    Doble_NodoC aux = cabeza.getSiguiente();
                    aux.setAnterior(cola);
                    cola.setSiguiente(aux);
                    cabeza = aux;
                }
            }else{
                for (int i = 0; i < (pos - 1); i++) {
                    recorrer = recorrer.getSiguiente();
                }
                Doble_NodoC sigue = recorrer.getSiguiente();
                recorrer.setSiguiente(sigue.getSiguiente());
                Doble_NodoC ante = recorrer.getAnterior();
                recorrer.setAnterior(ante.getAnterior());
            }
            numElement--;
        }else{
            JOptionPane.showMessageDialog(null, "ESTA POSICION NO EXISTE EN LA LISTA");
        }
    }
    
    public void EliminarTodo (){
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        } else {
            cabeza = cola = null;
            numElement = 0;
        }
    }
    
    // ----- METODOS DE BUSCAR Y MODIFICAR ----- //
    
    public boolean Buscar (String nom, int cod){
        Doble_NodoC aux= cabeza;
        boolean encontrado = false;
        do {            
        if (aux.getNombre().equals(nom) && aux.getCodigo() == cod) {
            encontrado = true;
        }else{
            aux = aux.getSiguiente();
        }
        } while (aux != cabeza && encontrado != true);
        return (encontrado);
    }
    
    public int Verificar(String nom, int cod) {
        Doble_NodoC aux = cabeza;
        int cont = 0;
        do {            
        if (aux.getNombre().equals(nom) && aux.getCodigo() == cod) {
            cont++;
        }
        aux = aux.getSiguiente();
        } while (aux != cabeza);
        return (cont);
    }
    
    public void Modificar (int posicion, String nom, int cod){
        Doble_NodoC aux = cabeza;
        if (posicion >= 0 && posicion < numElement) {
            if (posicion == 0) {
                cabeza.setNombre(nom);
                cabeza.setCodigo(cod);
            }else{
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setNombre(nom);
                aux.setCodigo(cod);
            }
        }else{
            JOptionPane.showMessageDialog(null, "ESTA POSICION NO EXISTE EN LA LISTA");
        }
    }

    public TableRowSorter filtro;

    public void Filtro() {
        int columnaABuscar = 0;
        if (opciones_3.getSelectedItem() == "< NOMBRE >") {
            columnaABuscar = 0;
        }
        if (opciones_3.getSelectedItem() == "< CODIGO >") {
            columnaABuscar = 1;
        }
        filtro.setRowFilter(RowFilter.regexFilter(txt_3.getText(), columnaABuscar));
    }

    public void EventoFiltro() {
        txt_3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txt_3.getText()).trim();
                txt_3.setText(cadena);
                Filtro();
            }
        });
        filtro = new TableRowSorter(tabla_3.getModel());
        tabla_3.setRowSorter(filtro);
    }

    // ----- METODO DE MOSTRAR ----- //
    
    public void Mostrar() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("          "+"< NOMBRE >");
        tabla.addColumn("          "+"< CODIGO >");
        tabla_3.setModel(tabla);
        String datos[] = new String[2];
        if (!EstaVacia()) {
            Doble_NodoC n = cabeza;
            do {             
            datos[0] = "          "+n.getNombre();
            datos[1] = "          "+String.valueOf(n.getCodigo());
            tabla.addRow(datos);
            n = n.getSiguiente();
            } while (n != cabeza);
        }
    }
    
    public double Promedio (int cant){
        Doble_NodoC aux = cabeza;
        double promedio = 0;
        double sumCod = 0;
        do {            
            sumCod = sumCod + aux.getCodigo();
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        promedio = (sumCod/cant);
        return (promedio);
    }
    
}
