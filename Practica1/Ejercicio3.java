import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el número de lagos del poligono");
        int n = entrada.nextInt();

        System.out.print("Ingresa la longitud de uno de los lados");
        double lado = entrada.nextDouble();
        entrada.close();
        System.out.print("El área es: "+ areaPoligono(n, lado)+"\n");
       
        
    }
    public static double areaPoligono(int n, double lado){
        return ((n * (lado * lado)) / (4.0 * Math.tan(Math.PI / n)));
    }
}
//descripción de cada ejercicio en el reporte
