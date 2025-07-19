/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estructuras;

public class ListaCircular<T> {
    class Nodo {
        T dato;
        Nodo siguiente;
        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = this; // circular
        }
    }

    private Nodo actual = null;

    public void agregar(T dato) {
        Nodo nuevo = new Nodo(dato);
        if (actual == null) {
            actual = nuevo;
        } else {
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    public T siguiente() {
        if (actual == null) return null;
        actual = actual.siguiente;
        return actual.dato;
    }
}
