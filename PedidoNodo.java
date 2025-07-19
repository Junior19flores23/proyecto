/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Pedido;

public class PedidoNodo {
    public Pedido pedido;
    public PedidoNodo siguiente;

    public PedidoNodo(Pedido pedido) {
        this.pedido = pedido;
        this.siguiente = null;
    }
}
