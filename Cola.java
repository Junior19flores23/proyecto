/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estructuras;

import java.util.LinkedList;
import java.util.Queue;

public class Cola<T> {
    private Queue<T> cola = new LinkedList<>();

    public void encolar(T dato) {
        cola.add(dato);
    }

    public T desencolar() {
        return cola.poll();
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder("🕒 Pedidos en espera:\n");
        for (T t : cola) {
            sb.append("🔹 ").append(t).append("\n");
        }
        return sb.toString();
    }
}
