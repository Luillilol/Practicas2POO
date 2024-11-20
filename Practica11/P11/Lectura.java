package mx.unam.fi.poo.g1.p11;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Clase Lectura
 * Clase que lee los archivos de texto y los concatena en un StringBuilder
 * @author González Falcón Luis Adrián
 * @version Noviembre 2024
 */
public class Lectura {
    private BufferedReader br;
    private StringBuilder sb;
    private String strLine;

    /**
     * Constructor de la clase Lectura
     * @param strLine Cadena de texto que será vacia
     */
    public Lectura (String strLine){
        sb = new StringBuilder();
        setStrLine(strLine);
    }
    /**
     * Método set del atributo strLine
     * @param strLine Cadena de texto
     */
    public void setStrLine(String strLine) {
        this.strLine = strLine;
    }
    /**
     * Método get del atributo strLine
     * @return Cadena de texto
     */
    public String getStrLine() {
        return strLine;
    }

    /**
     * Método que lee los archivos de texto y los concatena en un StringBuilder
     * @return StringBuilder con el contenido de los archivos
     */
    public StringBuilder leerArchivos(){
        try {
            for (int i = 0; i < 3; i++) {                
                br = new BufferedReader(new FileReader("/home/luillilol/Documents/Practicas2POO/Practica11/P11/archivo"+(i+1)+".txt"));
                while (getStrLine() != null) {
                    sb.append(getStrLine());
                    sb.append(System.lineSeparator());
                    setStrLine(br.readLine());
                    //strLine = br.readLine();
                    //System.out.println(strLine);
                }
                setStrLine("");
            }  
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }catch(IOException E){
            System.out.println("Error al leer el archivo");
        }
        return sb;
    }
}

