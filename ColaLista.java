/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ColaLista {

    private Nodo frente;
    private Nodo fin;

    // Enqueue
    public void enqueue(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
            return;
        }

        fin.siguiente = nuevo;

        fin = nuevo;
    }

    // Dequeue
    public int dequeue() {

        if (frente == null) {
            System.out.println("Cola vacía");
            return -1;
        }

        int dato = frente.dato;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return dato;
    }

    public void mostrar() {

        if (frente == null) {
            System.out.println("Cola vacía");
            return;
        }

        Nodo actual = frente;

        while (actual != null) {

            System.out.print(actual.dato + " ");

            actual = actual.siguiente;
        }

        System.out.println();
    }
}