import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Ejercicio0
 */
public class Ejercicio0 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/luillilol/Documents/POO/Practica11/test.txt"));
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no econtrado...");
            // TODO: handle exception
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...    ");
            // TODO: handle exception
        }
    }
}