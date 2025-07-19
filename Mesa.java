/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

public class Mesa {
    private int numero;
    private ArrayList<Pedido> pedidos;

    public Mesa(int numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminarPedidoPorIndice(int index) {
        if (index >= 0 && index < pedidos.size()) {
            pedidos.remove(index);
        }
    }

    public Pedido obtenerPedidoPorIndice(int index) {
        if (index >= 0 && index < pedidos.size()) {
            return pedidos.get(index);
        }
        return null;
    }

    public void anularUltimoPedido() {
        if (!pedidos.isEmpty()) {
            pedidos.remove(pedidos.size() - 1);
        }
    }

    public String resumenPedidos() {
        if (pedidos.isEmpty()) {
            return "🪑 Mesa " + numero + " no tiene pedidos.";
        }

        StringBuilder sb = new StringBuilder("📋 Pedidos de Mesa " + numero + ":\n");
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido p = pedidos.get(i);
            sb.append((i + 1)).append(". ")
              .append(p.getProducto().getNombre())
              .append(" x").append(p.getCantidad());

            if (p.isPrioritario()) {
                sb.append(" (🔺 Prioritario)");
            }

            sb.append("\n");
        }
        return sb.toString();
    }

    public String generarBoleta() {
        if (pedidos.isEmpty()) return "⚠️ No hay pedidos para generar boleta.";

        double total = 0;
        StringBuilder sb = new StringBuilder("🧾 Boleta - Mesa ").append(numero).append("\n");
        sb.append("----------------------------------\n");

        for (Pedido p : pedidos) {
            String nombre = p.getProducto().getNombre();
            int cantidad = p.getCantidad();
            double precio = p.getProducto().getPrecio();
            double subtotal = cantidad * precio;

            sb.append(nombre)
              .append(" x").append(cantidad)
              .append(" = S/.").append(String.format("%.2f", subtotal))
              .append(p.isPrioritario() ? " (Prioritario)" : "")
              .append("\n");

            total += subtotal;
        }

        sb.append("----------------------------------\n");
        sb.append("💵 Total: S/.").append(String.format("%.2f", total)).append("\n");

        return sb.toString();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public int getNumero() {
        return numero;
    }
}
