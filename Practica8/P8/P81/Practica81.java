package mx.unam.fi.poo.g1.p81;

import java.util.Random;
import mx.unam.fi.poo.g1.p81.*;

/**
 * Clase principal de la Practica 81
 * @author González Falcón Luis Adrián
 * @version Octubre-2024
 */
public class Practica81 {

    /**
     * Método principal donde se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {
        int[] arr1 = new int[20]; 
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr1[i] =  random.nextInt(100)+1;
        }
        System.out.println("\nQuick Sort:");
        imprime(arr1);
        QuickSort qSort = new QuickSort();
        qSort.ordenar(arr1);
        imprime(arr1);  

        System.out.println("\nMerge Sort:");
        for (int i = 0; i < 20; i++) {
            arr1[i] =  random.nextInt(100)+1;
        }
        imprime(arr1);
        MergeSort mSort = new MergeSort();
        mSort.ordenar(arr1);
        imprime(arr1);
    }

    /**
     * Método auxiliar de la clase principal para imprimir el arreglo de números
     * @param arr -> Arreglo que contiene los números a imprimir
     */
    public static void imprime(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}