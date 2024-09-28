import java.util.Scanner;
import java.lang.Math;
public class Practica0{
    public static void main(String[] args){
        double a, b, c;
        Scanner entrada = new Scanner(System.in);
        //Ingresar Valores
        System.out.print("Ingresa el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Ingresa el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Ingresa el valor de c: ");
        c = entrada.nextDouble();
        //System.out.println("valores: "+ a + b + c);
        double res1, res2;
        if((Math.sqrt(Math.pow(b, 2) - 4*a*c)) >= 0){
            //sacar los 2 resultados 
            res1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2 * a) ;
            res2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2 * a) ;
            System.out.println("Valor 1: "+ res1);
            System.out.println("Valor 2: "+ res2);

        }else{
            //error
            System.out.println("¡¡Se generan números imaginarios!!");
        }
    }
}