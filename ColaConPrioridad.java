/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.util.PriorityQueue;
import java.util.Comparator;

public class ColaConPrioridad {
    private PriorityQueue<NodoMesaPrioridad> cola;

    public ColaConPrioridad() {
        cola = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void offer(int mesa, boolean prioridad) {
        cola.offer(new NodoMesaPrioridad(mesa, prioridad));
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public int peek() {
        return cola.peek().mesa;
    }
}

class NodoMesaPrioridad implements Comparable<NodoMesaPrioridad> {
    int mesa;
    boolean prioridad;

    public NodoMesaPrioridad(int mesa, boolean prioridad) {
        this.mesa = mesa;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(NodoMesaPrioridad otro) {
        // true > false => prioridad alta primero
        return Boolean.compare(this.prioridad, otro.prioridad);
    }
}
