import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("\n\nDivisores de 3:");
        for (int i = 1; i < 100; i++) {
            if(i%3==0){
                System.out.print(i+", ");
            }
        }

        System.out.println("\n\nDivisores de 5:");
        for (int i = 1; i < 100; i++) {
            if(i%5==0 ){
                System.out.print(i+", ");
            }
        }


        System.out.println("\n\nDivisores de 3 y 5:");
        for (int i = 1; i < 100; i++) {
            if(i%3==0 && i%5==0 ){
                System.out.print(i+", ");
            }
        }

        System.out.println("\n");
    }
}
