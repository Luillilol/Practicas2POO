package mx.unam.fi.poo.g1.e1;
import mx.unam.fi.poo.g1.e1.*;

/**
 * Ejercicio1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Figura circulo = new Circulo(7.0);
        Figura cilindo = new Cilindro(4.0, 9.0);

        dibujaCalcula(circulo);
        dibujaCalcula(cilindo);
    }
    
    public static void dibujaCalcula(Figura figura){
        figura.dibuja();
        double area = figura.calcularArea();
        System.out.println("Área: "+ area);
    }
}