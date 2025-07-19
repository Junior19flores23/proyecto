/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Pedido;
import java.util.LinkedList;
import java.util.Queue;

public class GestorColaPedidos {
    private Queue<Pedido> cola = new LinkedList<>();

    public void encolarPedido(Pedido pedido) {
        cola.offer(pedido);
    }

    public Pedido atenderPedido() {
        return cola.poll();
    }

    public Pedido verSiguientePedido() {
        return cola.peek();
    }

    public void mostrarPedidosEnEspera() {
        if (cola.isEmpty()) {
            System.out.println("No hay pedidos en espera.");
            return;
        }
        for (Pedido p : cola) System.out.println(p);
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public int tamaño() {
        return cola.size();
    }
}
