import java.util.Scanner;
public class Practica31 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String cad = "Reemplazar un caracter especifico por otro";
        String cad2;
        String c, d;

        System.out.println("Cadena original: "+cad);

        System.out.println("Ingresa el caracter a cambiar: ");
        c = en.next();
        System.out.println("Ingresa el caracter a sustituir ");
        d = en.next();
        //Se cambia el caracter 'a' por 'o'
        cad2 = cad.replace(c, d);
        System.out.println("Cadena modificada: "+cad2);
    }
}
