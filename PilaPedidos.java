/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Pedido;
import java.util.Stack;

public class PilaPedidos {
    private Stack<Pedido> pila = new Stack<>();

    public void push(Pedido pedido) {
        pila.push(pedido);
    }

    public Pedido pop() {
        return pila.isEmpty() ? null : pila.pop();
    }

    public void mostrarHistorial() {
        if (pila.isEmpty()) {
            System.out.println("📭 Historial vacío.");
            return;
        }

        System.out.println("🧾 Historial de Pedidos:");
        for (Pedido p : pila) {
            System.out.println("- " + p.getProducto().getNombre() + " x" + p.getCantidad());
        }
    }
}
