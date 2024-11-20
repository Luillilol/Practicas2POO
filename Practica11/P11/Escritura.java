package mx.unam.fi.poo.g1.p11;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 * Clase Escritura
 * @author González Falcón Luis Adrián
 * @version Noviembre 2024
 */
public class Escritura {
    private FileWriter fw;
    private String filename;

    /**
     * Constructor de la clase Escritura
     * @param filename Ruta del archivo de texto
     */
    public Escritura(String filename){
        setFilename(filename);
    }

    /**
     * Método set del atributo filename
     * @param filename Ruta del archivo de texto
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }
    /**
     * Método get del atributo filename
     * @return Ruta del archivo de texto
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Método que escribe el contenido de un StringBuilder en un archivo de texto
     * @param sb StringBuilder con el contenido a escribir
     */
    public void escribirArchivo(StringBuilder sb){
        try {
            fw = new FileWriter(getFilename(), false);
            fw.write(sb.toString());
            fw.close();            
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }catch(IOException E){
            System.out.println("Error al leer el archivo");
        }
    }
}
