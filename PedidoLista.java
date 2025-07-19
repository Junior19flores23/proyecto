/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Pedido;
import java.util.LinkedList;

public class PedidoLista {
    private LinkedList<Pedido> pedidos = new LinkedList<>();

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public boolean eliminarUltimo() {
        if (!pedidos.isEmpty()) {
            pedidos.removeLast();
            return true;
        }
        return false;
    }

    public boolean eliminarPedidoPorIndice(int i) {
        if (i >= 0 && i < pedidos.size()) {
            pedidos.remove(i);
            return true;
        }
        return false;
    }

    public int size() {
        return pedidos.size();
    }

    public boolean isEmpty() {
        return pedidos.isEmpty();
    }

    public Pedido get(int i) {
        return pedidos.get(i);
    }

    public void mostrarPedidos() {
        for (Pedido p : pedidos) {
            System.out.println("- " + p.getProducto().getNombre() + " x" + p.getCantidad());
        }
    }
}
