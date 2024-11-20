import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Ejercicio3
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "/home/luillilol/Documents/POO/Practica11/miarchivo.txt";
            FileWriter fw = new FileWriter(filename, false);
            fw.write("Me la estoy pasando bien raro...\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("/home/luillilol/Documents/POO/Practica11/miarchivo.txt"));
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo"); 
        }
    }
}