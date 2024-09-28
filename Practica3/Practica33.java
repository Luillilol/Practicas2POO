import java.util.HashMap;
import java.util.Scanner;

public class Practica33 {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<Integer, String>();
        Scanner en = new Scanner(System.in);
        int valor;

        map.put(1, "Beagle");
        map.put(2, "Chihuahua");
        map.put(3, "Xoloitzcuincle");
        map.put(4, "Pastor Alemán");
        map.put(5, "Bulldog");
        map.put(6, "Salchicha");
        map.put(7, "Labrador");
        map.put(8, "Golden Retriever");
        map.put(9, "Corgi");
        map.put(10, "Dálmata");

        System.out.println("Ingresa la llave para saber el nombre del perrito (1-10)");
        valor = en.nextInt();

        System.out.println("El perrito es: "+map.get(valor));
        

        


    }
}
