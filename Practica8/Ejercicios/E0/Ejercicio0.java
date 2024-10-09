package mx.unam.fi.poo.g1.e0;

/**
 * Clase principal del Ejercicio 0
 * @author González Falcón Luis Adrián
 * @version Octubre-2024
 */
public class Ejercicio0 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args
     */

    public static void main(String[] args) {
        int[] arr ={
            4, 2, 0, 3, 1, 6, 8
        };

        Ordenamiento bubble = new BubbleSort();
        bubble.ordenar(arr);
        imprime(arr);

        Ordenamiento selection = new SelectionSort();
        selection.ordenar(arr);
        imprime(arr);
    }

    public static void imprime(int[] arr){
        for (int i : arr) {
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
