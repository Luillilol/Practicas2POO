package mx.unam.fi.poo.g1.p82;
import mx.unam.fi.poo.g1.p82.*;
/**
 * Clase Principal de la Practica 82
 * @author González Falcón Luis Adrián
 * @version Octubre - 2024
 */
public class Practica82 {
    /**
     * Método principal donde se ejecuta el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {
        Empleado gerente;
        gerente = new Gerente("Luis Falcon", "Gerente general");
        System.out.println("Nombre del empleado: "+ gerente.getNombre());
        System.out.println("Rol del empleado: "+ gerente.getRol());
        System.out.println("Salario: "+gerente.calcularSalario());

        System.out.println();
        Empleado programador;
        programador = new Programador("Santiago Danda", "Programador Fullstack");
        System.out.println("Nombre del empleado: "+ programador.getNombre());
        System.out.println("Rol del empleado: "+ programador.getRol());
        System.out.println("Salario: "+programador.calcularSalario());
    }
}