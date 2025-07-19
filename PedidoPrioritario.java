/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Pedido;

public class PedidoPrioritario {
    private Pedido pedido;
    private int prioridad;

    public PedidoPrioritario(Pedido pedido, int prioridad) {
        this.pedido = pedido;
        this.prioridad = prioridad;
    }

    public Pedido getPedido() { return pedido; }
    public int getPrioridad() { return prioridad; }

    @Override
    public String toString() {
        return "Prioridad " + prioridad + " → " + pedido;
    }
}
