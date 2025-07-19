/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estructuras;

public class ListaDoble<T> {
    private NodoDoble<T> cabeza, cola;

    public ListaDoble() {
        cabeza = cola = null;
    }

    public void agregarFinal(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    @Override
    public String toString() {
        if (cabeza == null) return "📭 Lista vacía.";

        StringBuilder sb = new StringBuilder("📖 Historial:\n");
        NodoDoble<T> actual = cabeza;
        while (actual != null) {
            sb.append("📝 ").append(actual.dato).append("\n");
            actual = actual.siguiente;
        }
        return sb.toString();
    }
}

class NodoDoble<T> {
    T dato;
    NodoDoble<T> anterior, siguiente;

    public NodoDoble(T dato) {
        this.dato = dato;
    }
}
