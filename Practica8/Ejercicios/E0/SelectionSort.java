package mx.unam.fi.poo.g1.e0;

import mx.unam.fi.poo.g1.e0.Ordenamiento;

public class SelectionSort implements Ordenamiento{
    
    @Override
    public void ordenar(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}