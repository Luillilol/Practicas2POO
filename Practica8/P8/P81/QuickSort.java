package mx.unam.fi.poo.g1.p81;

import mx.unam.fi.poo.g1.p81.Ordenamiento;

/**
 * Clase QuickSort
 * @author González Falcón Luis Adrián
 * @version Octubre - 2024
 */
public class QuickSort implements Ordenamiento{
    @Override
    public void ordenar(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    /**
     * Método del algoritmo QuickSort que ordena los elementos respecto a un pivote, los elementos menores a él se colocan a su izquierda, y los mayores a su derecha.
     * @param arr -> Arreglo a ordenar
     * @param low -> Valor que indica el indice del extremo inferior de la partición actual
     * @param high -> Valor que indica el indice del extremo superior de la partición actual
     * @return Indice del pivote después del ordenamiento interno, que indica la partición.
     */
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){ 
            if (arr[j] <= pivot){
                i++;
                intercambiar(arr, i,j);
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    /**
     * Método que se encarga de llamar a las funciones recursivas para ordenar el subarreglo respecto al rango dado.
     * @param arr -> Arreglo a ordenar
     * @param low -> Indice más bajo de la particion
     * @param high -> Indice más alto de la partición
     */
    public void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    /**
     * Método auxiliar que funciona para intercambiar 2 números en un arreglo
     * @param arr -> Arreglo donde están contenidos los 2 valores
     * @param x -> Valor 1 a intercambiar
     * @param y -> Valor 2 a intercambiar
     */
    public void intercambiar(int[] arr, int x, int y) {
        int temp = arr[x];   
        arr[x] = arr[y];  
        arr[y] = temp;
    }
}