/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Producto;

public class ArbolProducto {

    private NodoArbol raiz;

    public ArbolProducto() {
        this.raiz = null;
    }

    public void insertar(Producto producto) {
        raiz = insertarRecursivo(raiz, producto);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, Producto producto) {
        if (actual == null) {
            return new NodoArbol(producto);
        }

        if (producto.getNombre().compareToIgnoreCase(actual.producto.getNombre()) < 0) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, producto);
        } else {
            actual.derecho = insertarRecursivo(actual.derecho, producto);
        }

        return actual;
    }

    // ✔️ Este método se llama desde MenuPrincipal
    public void inOrden(NodoArbol nodo, StringBuilder sb) {
        if (nodo != null) {
            inOrden(nodo.izquierdo, sb);
            sb.append("🔹 ").append(nodo.producto.getNombre())
              .append(" - S/.").append(nodo.producto.getPrecio())
              .append(" | Stock: ").append(nodo.producto.getStock()).append("\n");
            inOrden(nodo.derecho, sb);
        }
    }

    // ✔️ Este getter lo necesitas para acceder a la raíz
    public NodoArbol getRaiz() {
        return raiz;
    }
}
