
package Ejercicio_1;

import static Ejercicio_1.Interfaz_1.opciones_1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Ejercicio_1.Interfaz_1.tabla_1;
import static Ejercicio_1.Interfaz_1.txt_1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class Estructuras_Enlazadas {

    private Nodo cabeza;
    private int numElement;

    public Estructuras_Enlazadas() {
        cabeza = null;
        numElement = 0;
    }

    public boolean EstaVacia (){
        return (cabeza == null);
    }
    
    public int numElementos() {
        return (numElement);
    }

    // ----- METODOS DE INSERCION ----- //
    
    public void InsertarAlinicio(Nodo nuevo) {
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
        numElement++;
    }

    public void InsertarAlfinal(Nodo nuevo) {
        Nodo aux = cabeza;
        if (EstaVacia()) {
            cabeza = nuevo;
            nuevo.setSiguiente(null);
        } else {
            while (aux.getSiguiente() != null) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
        }
        numElement++;
    }
    
    public void InsertarPosicion (int posicion, Nodo nuevo){
        Nodo aux = cabeza;
        if (posicion >= 0 && posicion < numElement) {
            if (posicion == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }else{
                for (int i = 0; i < (posicion - 1); i++) {
                    aux = aux.getSiguiente();
                }
                Nodo sigue = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(sigue);
            }
            numElement++;
        }else{
            JOptionPane.showMessageDialog(null, "ESTA POSICION NO EXISTE EN LA LISTA");
        }
    }

    // ----- METODOS DE ELIMINACION ----- //
    
    public void EliminarAlincio() {
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        } else {
            cabeza = cabeza.getSiguiente();
            numElement--;
        }
    }

    public void EliminarAlfinal() {
        Nodo aux = cabeza;
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        } else {
            if (aux.getSiguiente() == null) {
                cabeza = null;
            } else {
                if (aux.getSiguiente() != null) {
                    while (aux.getSiguiente().getSiguiente() != null) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(null);
                }
            }
            numElement--;
        }
    }

    public void EliminarDato (String nom, int cod){
        if (EstaVacia()) {
            JOptionPane.showMessageDialog(null, "< LA LISTA ESTA VACIA >");
        }else{
            if (cabeza.getNombre().equals(nom) && cabeza.getCodigo() == cod) {
                cabeza = cabeza.getSiguiente();
                numElement--;
            }else{
                Nodo aux = cabeza;
                while (aux.getSiguiente() != null && aux.getSiguiente().getNombre() != nom && aux.getSiguiente().getCodigo() != cod) {                    
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == null) {
                    JOptionPane.showMessageDialog(null, "< ESTE ELEMENTO NO EXISTE EN LA LISTA >");
                }else{
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    numElement--;
                }
            }
        }
    }
    
    public void EliminarPosicion(int posicion) {
        Nodo aux = cabeza;
        if (posicion >= 0 && posicion < numElement) {
            if (posicion == 0) {
                cabeza = cabeza.getSiguiente();
            }else{
                for (int i = 0; i < (posicion - 1); i++) {
                    aux = aux.getSiguiente();
                }
                Nodo sigue = aux.getSiguiente();
                aux.setSiguiente(sigue.getSiguiente());
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
            cabeza = null;
            numElement = 0;
        }
    }

    // ----- METODOS DE BUSCAR Y MODIFICAR ----- //
    
    public boolean Buscar (String nom, int cod){
        Nodo aux= cabeza;
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
        Nodo aux = cabeza;
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
        Nodo aux = cabeza;
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
        if (opciones_1.getSelectedItem() == "< NOMBRE >") {
            columnaABuscar = 0;
        }
        if (opciones_1.getSelectedItem() == "< CODIGO >") {
            columnaABuscar = 1;
        }
        filtro.setRowFilter(RowFilter.regexFilter(txt_1.getText(), columnaABuscar));
    }

    public void EventoFiltro() {
        txt_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txt_1.getText()).trim();
                txt_1.setText(cadena);
                Filtro();
            }
        });
        filtro = new TableRowSorter(tabla_1.getModel());
        tabla_1.setRowSorter(filtro);
    }

    // ----- METODOS DE MOSTRAR ----- //
    
    public void MostrarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("< NOMBRE >");
        tabla.addColumn("< CODIGO >");
        tabla_1.setModel(tabla);
        String datos[] = new String[2];
        Nodo n = cabeza;
        while (n != null) {
            datos[0] = n.getNombre();
            datos[1] = String.valueOf(n.getCodigo());
            tabla.addRow(datos);
            n = n.getSiguiente();
        }
    }
    
    public double Promedio (int cant){
        Nodo aux = cabeza;
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
