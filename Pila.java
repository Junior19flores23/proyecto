/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// estructuras/Pila.java
package estructuras;

import java.util.Stack;

public class Pila<T> {
    private Stack<T> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public void push(T elemento) {
        pila.push(elemento);
    }

    @Override
    public String toString() {
        if (pila.isEmpty()) return "📭 Pila vacía.";

        StringBuilder sb = new StringBuilder("📦 Platos Devueltos:\n");
        for (T elem : pila) {
            sb.append("🔙 ").append(elem.toString()).append("\n");
        }
        return sb.toString();
    }
}
