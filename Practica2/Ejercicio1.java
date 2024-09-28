import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int i, j,r;
        System.out.println("Ingresa el número de filas (mitad del diamante:)");
        Scanner en = new Scanner(System.in);
        r = en.nextInt();
        en.close();

        //Piramide superior
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Piramide inferior
        for(i = r-1; i>=1; i--){
            for(j = 1; j<=r-i;j++){
                System.out.print(" ");
            }
            for (j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
