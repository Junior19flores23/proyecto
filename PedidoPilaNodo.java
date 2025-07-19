/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Pedido;

public class PedidoPilaNodo {
    public Pedido pedido;
    public PedidoPilaNodo siguiente;

    public PedidoPilaNodo(Pedido pedido) {
        this.pedido = pedido;
        this.siguiente = null;
    }
}
