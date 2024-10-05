package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.*;
/**
 * Clase principal de la Practica 7
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Practica7 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {
        //crear objetos manager, desarrolladot y programador 30, 45, 80

        Manager manager = new Manager("Luis Falcón", "Nezahualcóyotl", "Manager", 80000.0);
        Desarrollador desarrollador = new Desarrollador("Fernando Samuel", "Av. Ermita", "Desarrollador", 50000.0);
        Programador programador = new Programador("Andreco Juarez", "Tláhuac", "Programador", 30000.0);

        System.out.println("Mánager: ");
        System.out.println("Se otorga un bono al manager: ");
        manager.calcularBonos();
        System.out.println(manager);
        System.out.println(manager.reporteDesempeño());
        System.out.println(manager.manejoProyectos());

        System.out.println();

        System.out.println("Desarrollador: ");
        System.out.println("Se otorga un bono al desarrollador: ");
        desarrollador.calcularBonos();
        System.out.println(desarrollador);
        System.out.println(desarrollador.reporteDesempeño());
        System.out.println(desarrollador.manejoProyectos());

        System.out.println();

        System.out.println("Programador: ");
        System.out.println("Se otorga un bono al programador: ");
        programador.calcularBonos();
        System.out.println(programador);
        System.out.println(programador.reporteDesempeño());
        System.out.println(programador.manejoProyectos());
    }
}
