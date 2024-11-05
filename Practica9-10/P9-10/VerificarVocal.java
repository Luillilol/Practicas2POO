package mx.unam.fi.poo.g1.p9_10;

import mx.unam.fi.poo.g1.p9_10.VocalException;

/**
 * Clase encargada de verificar la excepción
 * @author González Falcón Luis Adrián
 * @version Octubre - 2024
 */

public class VerificarVocal {
    /**
     * Método que se encarga de verificar si la cadena contiene vocales
     * @param cadena -> Cadena a verificar
     * @throws VocalException -> Excepción que lanza cuando la cadena no contiene vocales
     */
    public void checarCadena(String cadena)throws VocalException{
        if(! cadena.matches(".*[aeiouAEIOU].*")){
            throw new VocalException("La cadena no contiene vocales");
        }else{
            System.out.println("La cadena contiene vocales");
        }
    }       
}