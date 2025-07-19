/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import modelo.Producto;
import modelo.Mesa;
import modelo.Pedido;
import estructuras.*;
import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Mesa> mesas;
    private ArrayList<Producto> productos;
    private ArbolProducto arbolProductos;
    private int contadorProductos;

    // Estructuras nuevas
    private ListaDoble<String> historialPedidos;
    private ColaCircular<Pedido> colaPedidosEspera; // Cambiado de NodoCola a Pedido
    private ColaConPrioridad colaTurnoMesas;
    private Pila<String> pilaPlatosDevueltos;

    public Restaurante() {
        mesas = new ArrayList<>();
        productos = new ArrayList<>();
        arbolProductos = new ArbolProducto();
        contadorProductos = 1;

        historialPedidos = new ListaDoble<>();
        colaPedidosEspera = new ColaCircular<>(20); // Capacidad de 20
        colaTurnoMesas = new ColaConPrioridad();
        pilaPlatosDevueltos = new Pila<>();

        for (int i = 0; i < 10; i++) {
            mesas.add(new Mesa(i + 1));
        }

        // Agregar productos de ejemplo
        agregarProducto(new Producto(contadorProductos++, "Lomo Saltado", 18.0, 20));
        agregarProducto(new Producto(contadorProductos++, "Ceviche Mixto", 22.0, 15));
        agregarProducto(new Producto(contadorProductos++, "Arroz con Pollo", 14.0, 30));
        agregarProducto(new Producto(contadorProductos++, "Chaufa de Pollo", 16.0, 25));
        agregarProducto(new Producto(contadorProductos++, "Inka Cola", 5.0, 50));
        agregarProducto(new Producto(contadorProductos++, "Chicha Morada", 4.5, 40));
    }

    private void agregarProducto(Producto p) {
        productos.add(p);
        arbolProductos.insertar(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArbolProducto getArbolProductos() {
        return arbolProductos;
    }

    public boolean realizarPedido(int numMesa, int idProducto, int cantidad) {
        return realizarPedido(numMesa, idProducto, cantidad, false);
    }

    public boolean realizarPedido(int numMesa, int idProducto, int cantidad, boolean prioridad) {
        if (numMesa < 1 || numMesa > mesas.size()) return false;

        Producto prod = buscarProductoPorId(idProducto);
        if (prod == null || prod.getStock() < cantidad) return false;

        prod.setStock(prod.getStock() - cantidad);
        Pedido pedido = new Pedido(prod, cantidad, prioridad);
        mesas.get(numMesa - 1).agregarPedido(pedido);

        historialPedidos.agregarFinal("Mesa " + numMesa + ": " + prod.getNombre() + " x" + cantidad + (prioridad ? " (Prioritario)" : ""));
        colaPedidosEspera.encolar(pedido); // Ahora se encola directamente el Pedido
        colaTurnoMesas.offer(numMesa, prioridad);

        return true;
    }

    public boolean eliminarPedidoPorIndice(int numMesa, int index) {
        if (numMesa < 1 || numMesa > mesas.size()) return false;

        Pedido eliminado = mesas.get(numMesa - 1).obtenerPedidoPorIndice(index);
        if (eliminado != null) {
            pilaPlatosDevueltos.push("🔙 " + eliminado.getProducto().getNombre() + " x" + eliminado.getCantidad() + " (Mesa " + numMesa + ")");
            historialPedidos.agregarFinal("🗑 Mesa " + numMesa + ": devolvió " + eliminado.getProducto().getNombre() + " x" + eliminado.getCantidad());
            mesas.get(numMesa - 1).eliminarPedidoPorIndice(index);
            return true;
        }
        return false;
    }

    public String obtenerPedidosDeMesa(int numMesa) {
        if (numMesa < 1 || numMesa > mesas.size()) return "Mesa inválida.";
        return mesas.get(numMesa - 1).resumenPedidos();
    }

    public void anularUltimoPedido(int numMesa) {
        if (numMesa < 1 || numMesa > mesas.size()) return;
        mesas.get(numMesa - 1).anularUltimoPedido();
    }

    public String generarBoleta(int numMesa) {
        if (numMesa < 1 || numMesa > mesas.size()) return "Mesa inválida.";
        return mesas.get(numMesa - 1).generarBoleta();
    }

    public void agregarRecargoPrioridad(int numMesa) {
        if (numMesa < 1 || numMesa > mesas.size()) return;

        Producto recargo = new Producto(9999, "⚡ Pedido Prioritario (Recargo)", 5.0, 1);
        Pedido pedidoPrioritario = new Pedido(recargo, 1, true);

        mesas.get(numMesa - 1).agregarPedido(pedidoPrioritario);
        historialPedidos.agregarFinal("Mesa " + numMesa + ": Recargo prioridad aplicado.");
    }

    private Producto buscarProductoPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // Métodos para botones del JFrame
    public String verHistorialPedidos() {
        return historialPedidos.toString();
    }

    public String verPedidosEnEspera() {
        return colaPedidosEspera.toString();
    }

    public String verPlatosDevueltos() {
        return pilaPlatosDevueltos.toString();
    }

    public String verTurnoSiguienteMesa() {
        if (colaTurnoMesas.isEmpty()) return "📭 No hay mesas en turno.";
        return "📢 Turno actual: Mesa " + colaTurnoMesas.peek();
    }
}
