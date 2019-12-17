
package Ejercicio_2;

import static Ejercicio_2.Interfaz_2.opciones_2;
import static Ejercicio_2.Interfaz_2.tabla_2;
import static Ejercicio_2.Interfaz_2.txt_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Estructuras_Dobles {
    
    private Doble_Nodo cabeza;
    private Doble_Nodo cola;
    private int numElement;

    public Estructuras_Dobles() {
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
    
    public void InsertarAlinicio(Doble_Nodo nuevo) {
        if (EstaVacia()) {
            cabeza = cola = nuevo;
        }else{
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        numElement++;
    }

    public void InsertarAlfinal(Doble_Nodo nuevo) {
        if (EstaVacia()) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        numElement++;
    }
    
    public void InsertarPosicion (int posicion, Doble_Nodo nuevo){
        Doble_Nodo aux = cabeza;
        if (posicion >= 0 && posicion < numElement) {
            if (posicion == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevo);
                cabeza = nuevo;
            }else{
                for (int i = 0; i < (posicion - 1); i++) {
                    aux = aux.getSiguiente();
                }
                Doble_Nodo sigue = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(sigue);
                Doble_Nodo ante = aux.getAnterior();
                aux.setAnterior(nuevo);
                aux.setAnterior(ante);
            }
            numElement++;
        }else{
            JOptionPane.showMessageDialog(null, "ESTA POSICION NO EXISTE EN LA LISTA");
        }
    }
    
    // ----- METODOS DE ELIMINACION ----- //
    
    public void EliminarIncio() {
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        } else {
            if (cabeza == cola) {
                cabeza = cola = null;
            }else{
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
            }
            numElement--;
        }
    }

    public void EliminarFinal() {
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        } else {
            if (cabeza == cola) {
                cabeza = cola = null;
            }else{
                cola = cola.getAnterior();
                cola.setSiguiente(null);
            }
            numElement--;
        }
    }
    
    public void EliminarDato (String nom, int cod){
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        }else{
            if (cabeza.getNombre().equals(nom) && cabeza.getCodigo() == cod) {
                if (cabeza == cola) {
                    cabeza = cola = null;
                }else{
                    cabeza = cabeza.getSiguiente();
                    cabeza.setAnterior(null);
                }
                numElement--;
            }else{
                Doble_Nodo aux = cabeza;
                while (aux != null && aux.getNombre() != nom && aux.getCodigo() != cod) {                    
                    aux = aux.getSiguiente();
                }
                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "< ESTE ELEMENTO NO EXISTE EN LA LISTA >");
                }else{
                    if (aux == cola) {
                        cola = cola.getAnterior();
                        cola.setSiguiente(null);
                        numElement--;
                    }else{
                        Doble_Nodo ante = aux.getAnterior();
                        Doble_Nodo sigue = aux.getSiguiente();
                        ante.setSiguiente(sigue);
                        sigue.setAnterior(ante);
                        numElement--;
                    }
                }
            }
        }
    }
    
    public void EliminarPosicion(int posicion) {
        Doble_Nodo aux = cabeza;
        if (posicion >= 0 && posicion < numElement) {
            if (posicion == 0) {
                if (numElement == 1) {
                    cabeza = cola = null;
                }else{
                   cabeza = cabeza.getSiguiente();
                   cabeza.setAnterior(null);
                }
            }else{
                for (int i = 0; i < (posicion - 1); i++) {
                    aux = aux.getSiguiente();
                }
                Doble_Nodo sigue = aux.getSiguiente();
                aux.setSiguiente(sigue.getSiguiente());
                aux.setAnterior(null);
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
        Doble_Nodo aux= cabeza;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {            
            if (aux.getNombre().equals(nom) && aux.getCodigo() == cod) {
                encontrado = true;
            }else{
                aux = aux.getSiguiente();
            }
        }
        return (encontrado);
    }
    
    public int Verificar(String nom, int cod) {
        Doble_Nodo aux = cabeza;
        int cont = 0;
        while (aux != null) {
            if (aux.getNombre().equals(nom) && aux.getCodigo() == cod) {
                cont++;
            }
            aux = aux.getSiguiente();
        }
        return (cont);
    }
    
    public void Modificar (int posicion, String nom, int cod){
        Doble_Nodo aux = cabeza;
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
        if (opciones_2.getSelectedItem() == "< NOMBRE >") {
            columnaABuscar = 0;
        }
        if (opciones_2.getSelectedItem() == "< CODIGO >") {
            columnaABuscar = 1;
        }
        filtro.setRowFilter(RowFilter.regexFilter(txt_2.getText(), columnaABuscar));
    }

    public void EventoFiltro() {
        txt_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txt_2.getText()).trim();
                txt_2.setText(cadena);
                Filtro();
            }
        });
        filtro = new TableRowSorter(tabla_2.getModel());
        tabla_2.setRowSorter(filtro);
    }

    // ----- METODOS DE MOSTRAR ----- //
    
    public void MostrarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("< NOMBRE >");
        tabla.addColumn("< CODIGO >");
        tabla_2.setModel(tabla);
        String datos[] = new String[2];
        Doble_Nodo n = cabeza;
        while (n != null) {
            datos[0] = n.getNombre();
            datos[1] = String.valueOf(n.getCodigo());
            tabla.addRow(datos);
            n = n.getSiguiente();
        }
    }

    public double Promedio (int cant){
        Doble_Nodo aux = cabeza;
        double promedio = 0;
        double sumCod = 0;
        while (aux != null) {            
            sumCod = sumCod + aux.getCodigo();
            aux = aux.getSiguiente();
        }
        promedio = (sumCod/cant);
        return (promedio);
    }
    
}
