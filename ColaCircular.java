/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

public class ColaCircular<T> {
    private Object[] elementos;
    private int frente;
    private int fin;
    private int tamaño;
    private int capacidad;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        elementos = new Object[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public void encolar(T elemento) {
        if (estaLlena()) {
            System.out.println("⚠️ Cola llena. No se puede encolar.");
            return;
        }
        fin = (fin + 1) % capacidad;
        elementos[fin] = elemento;
        tamaño++;
    }

    public T desencolar() {
        if (estaVacia()) {
            System.out.println("⚠️ Cola vacía. No se puede desencolar.");
            return null;
        }
        @SuppressWarnings("unchecked")
        T elemento = (T) elementos[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return elemento;
    }

    public T frente() {
        if (estaVacia()) return null;
        @SuppressWarnings("unchecked")
        T elemento = (T) elementos[frente];
        return elemento;
    }

    @Override
    public String toString() {
        if (estaVacia()) return "📭 Cola vacía.";

        StringBuilder sb = new StringBuilder("🔄 Cola Circular:\n");
        int i = frente;
        int count = 0;

        while (count < tamaño) {
            @SuppressWarnings("unchecked")
            T elem = (T) elementos[i];
            sb.append("🔸 ").append(elem.toString()).append("\n");
            i = (i + 1) % capacidad;
            count++;
        }
        return sb.toString();
    }
}
