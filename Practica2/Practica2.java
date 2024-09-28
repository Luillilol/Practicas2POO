import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Ingresa un número: ");

        int filas = en.nextInt();
        int numero;
        en.close();
        for (int i = 0; i < filas; i++) {
            //imprimir ceros
            for (int j = 0; j < filas-i; j++) {
                System.out.print(" ");
            }
            //calcular números:
            numero = 1;
            for(int k = 0;k<=i; k++){            
                System.out.print(numero + " ");
                //numero siguiente
                numero = numero * (i-k) / (k+1) ;
            }
            System.out.println();
        }
    }
}
