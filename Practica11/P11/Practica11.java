package mx.unam.fi.poo.g1.p11;
import mx.unam.fi.poo.g1.p11.*;

/**
 * Clase principal Practica11
 * @author González Falcón Luis Adrián
 * @version Noviembre 2024
 */
public class Practica11 {
    /**
     * Método principal
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {    
        Escritura wr = new Escritura("/home/luillilol/Documents/Practicas2POO/Practica11/P11/archivo4.txt");
        Lectura re = new Lectura("");
        
        wr.escribirArchivo(re.leerArchivos());  
        System.out.println("Archivos copiados con éxito");
    }
}