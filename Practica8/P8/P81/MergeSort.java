package mx.unam.fi.poo.g1.p81;

import mx.unam.fi.poo.g1.p81.Ordenamiento;


/**
 * Clase MergeSort
 * @author González Falcón Luis Adrián
 * @version Octubre-2024
 */
public class MergeSort implements Ordenamiento{
    @Override
    public void ordenar(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    /**
     * Método que se encarga de ordenar y fusionar 2 subarreglos para la funcionalidad de MergeSort
     * @param arr -> Arreglo completo a ordenar
     * @param left -> Indice del inicio del primer subarreglo
     * @param mid -> Indice medio de ambas sublistas
     * @param right -> Indice final del segundo subarreglo
     */
    public void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Método que se encarga de partir en mitades la lista hasta llegar a listas de tamaño 1
     * @param arr -> Arrego a dividir
     * @param left -> Indice inicial del subarreglo
     * @param right -> Indica final del subarreglo
     */
    public void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

}