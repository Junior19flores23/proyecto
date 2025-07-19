/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelo.Producto;
import java.util.*;

public class MenuNodo {
    private String nombreCategoria;
    private List<Producto> productos;
    private List<MenuNodo> subcategorias;

    public MenuNodo(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.productos = new ArrayList<>();
        this.subcategorias = new ArrayList<>();
    }

    public void agregarSubcategoria(MenuNodo nodo) {
        subcategorias.add(nodo);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarMenu(String prefijo) {
        System.out.println(prefijo + "📂 " + nombreCategoria);
        for (Producto p : productos) {
            System.out.println(prefijo + "   🥘 " + p.getNombre() + " - S/." + p.getPrecio());
        }
        for (MenuNodo sub : subcategorias) {
            sub.mostrarMenu(prefijo + "   ");
        }
    }
}
