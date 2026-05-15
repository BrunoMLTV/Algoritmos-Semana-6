/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ColaPrioridad {

    private int[] cola;
    private int tamaño;

    public ColaPrioridad(int capacidad) {

        cola = new int[capacidad];

        tamaño = 0;
    }

    // Enqueue con prioridad
    public void enqueue(int dato) {

        if (tamaño == cola.length) {
            System.out.println("Cola llena");
            return;
        }

        int i;

        for (i = tamaño - 1; i >= 0 && cola[i] > dato; i--) {

            cola[i + 1] = cola[i];
        }

        cola[i + 1] = dato;

        tamaño++;
    }

    // Dequeue
    public int dequeue() {

        if (tamaño == 0) {
            System.out.println("Cola vacía");
            return -1;
        }

        int dato = cola[0];

        for (int i = 1; i < tamaño; i++) {
            cola[i - 1] = cola[i];
        }

        tamaño--;

        return dato;
    }

    public void mostrar() {

        if (tamaño == 0) {
            System.out.println("Cola vacía");
            return;
        }

        for (int i = 0; i < tamaño; i++) {

            System.out.print(cola[i] + " ");
        }

        System.out.println();
    }
}