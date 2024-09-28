import java.util.ArrayList;
import java.util.Scanner;

public class Practica32 {
    public static void main(String[] args) {
        String nombre;
        Scanner en = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<String>();
        numeros.add("Luis");
        numeros.add("Violeta");
        numeros.add("Miguel");
        numeros.add("Fernando");
        numeros.add("Adrián");
        numeros.add("Ximena");
        numeros.add("Falcón");
        
        System.out.println("Arreglo con nombres: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println("Nombre para remplazar: ");
        nombre = en.next();
        numeros.set(1, nombre);
        System.out.println("Arreglo sustituido: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(numeros.get(i));
        }                                          

    }
}
