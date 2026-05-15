/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Main {
    public static void main(String[] args) {

        // COLA CIRCULAR
        System.out.println("COLA CIRCULAR");

        ColaCircular colaCircular = new ColaCircular(5);

        colaCircular.enqueue(10);
        colaCircular.enqueue(20);
        colaCircular.enqueue(30);

        colaCircular.mostrar();

        System.out.println("Dequeue: " +
                colaCircular.dequeue());

        colaCircular.mostrar();

        // COLA CON LISTAS ENLAZADAS
        System.out.println("\nCOLA LISTA");

        ColaLista colaLista = new ColaLista();

        colaLista.enqueue(1);
        colaLista.enqueue(2);
        colaLista.enqueue(3);

        colaLista.mostrar();

        System.out.println("Dequeue: " +
                colaLista.dequeue());

        colaLista.mostrar();

        // COLA CON PRIORIDAD
        System.out.println("\nCOLA PRIORIDAD");

        ColaPrioridad colaPrioridad =
                new ColaPrioridad(10);

        colaPrioridad.enqueue(30);
        colaPrioridad.enqueue(10);
        colaPrioridad.enqueue(20);
        colaPrioridad.enqueue(5);

        colaPrioridad.mostrar();

        System.out.println("Dequeue: " +
                colaPrioridad.dequeue());

        colaPrioridad.mostrar();
    }
}
