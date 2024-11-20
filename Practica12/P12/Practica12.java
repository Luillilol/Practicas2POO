package mx.fi.unam.poo.g1.p12;

import mx.fi.unam.poo.g1.p12.*;

/**
 * Clase principal que ejecuta el programa
 * @author González Falcón Luis Adrián
 * @version Noviembre 2024
 */
public class Practica12 {

    /**
     * Método principal que ejecuta el programa
     * @param args arreglo por defecto del método
     */
    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco(500.0);
    
        //creacion de los dos hilos q contienen los objetos clientes
        Thread cliente1 = new Thread(new Cliente(cuenta), "Cliente 1");
        Thread cliente2 = new Thread(new Cliente(cuenta), "Cliente 2");    
    
        cliente1.start();
        cliente2.start();
        
    }
}
