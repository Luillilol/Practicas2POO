package mx.unam.fi.poo.g1.e0;

import mx.unam.fi.poo.g1.e0.Ordenamiento;

/**
 * Clase BubbleSort
 * @author González Falcón Luis Adrián 
 * @version Octubre-2024
 */
public class BubbleSort implements Ordenamiento{

    @Override
    public void ordenar(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for (int j = 0; j < n-1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}