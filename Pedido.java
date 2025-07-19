/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Pedido {
    private Producto producto;
    private int cantidad;
    private boolean prioritario;

    public Pedido(Producto producto, int cantidad, boolean prioritario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.prioritario = prioritario;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidad + (prioritario ? " 🔺 Prioritario" : "");
    }
}
