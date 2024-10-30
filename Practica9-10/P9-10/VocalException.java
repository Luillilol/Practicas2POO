package mx.unam.fi.poo.g1.p9_10;

/**
 * Clase encargada de crear una excepción personalizada
 * @author González Falcón Luis Adrián
 * @version Octubre - 2024
 */

public class VocalException extends Exception{
    /**
     * Método constructor de la clase VocalException
     * @param mensaje -> Mensaje que se mostrará en la excepción
     */
    public VocalException(String mensaje){
        super(mensaje);
    }
}



