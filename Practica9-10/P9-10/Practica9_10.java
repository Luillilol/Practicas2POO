package mx.unam.fi.poo.g1.p9_10;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p9_10.*;

/**
 * Clase pricipal de la práctica 9-10
 * @author González Falcón Luis Adrián
 * @version Octubre - 2024 
 */
public class Practica9_10 {
    /**
     * Método principal donde se ejecuta el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {
        String cadenaVocales = "Esto es una cadena con vocales";
        String cadenaNoVocales = "Stsncdnsnvcls";
        VerificarVocal verificar = new VerificarVocal();
        try {
            verificar.checarCadena(cadenaVocales);
            verificar.checarCadena(cadenaNoVocales);
        } catch (VocalException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}