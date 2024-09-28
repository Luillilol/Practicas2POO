import java.util.Scanner;
import java.lang.Math;

public class Practica1 {
    public static void main(String[] args) {
        double x1, x2, y1, y2;    
        Scanner en = new Scanner(System.in);

        System.out.print("Latitud x1: ");
        x1 = en.nextDouble();
        System.out.print("Longitud y1: ");
        y1 = en.nextDouble();
        System.out.print("Latitud x2: ");
        x2 = en.nextDouble();
        System.out.print("Longitud y2: ");
        y2 = en.nextDouble();
        en.close();
        calculoDistancia(x1, y1, x2, y2);
    }

    public static double calculoDistancia(double x1, double y1, double x2, double y2 ){    
        double radio = 6371.01;
        double distancia;
        distancia = radio * (Math.acos(Math.sin(convRad(x1)) * Math.sin(convRad(x2)) + Math.cos(convRad(x1)) * Math.cos(convRad(x2)) * Math.cos(convRad(y2-y1)) ));
        System.out.println("Distancia: "+distancia);
        return 0;
    }
    public static double convRad(double grados){
        return (grados*Math.PI)/180;
    }
}

