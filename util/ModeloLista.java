/**
 * ModeloLista.java
 *
 * Clase creada el 3 de Diciembre de 2023
 */
package util;

import javax.swing.DefaultListModel;

/**
 * Esta clase es una implementacion de un JList
 *
 * @author Fabricio Aldaco Aguilera 00000235101
 *
 * @param <T> tipo de dato
 */
public class ModeloLista<T> extends DefaultListModel<T> {

    public void agregar(T dato) {
        addElement(dato);
    }

    public void eliminar(T dato) {
        removeElement(dato);
    }

}