import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Proyecto3 {
    public static void main(String[] args) {
        String rutaArchivo = args[0];
        StringBuilder sb = new StringBuilder();


        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/luillilol/Documents/Practicas2POO/Proyecto3/"+rutaArchivo));
            //primero se guardan todas las variables a String para checar si hay valores nulos
            String nombre = br.readLine();
            String frecMuestreoStr = br.readLine();
            String canalesStr = br.readLine();
            String numMuestrasStr = br.readLine();
            String tiempoStr = br.readLine();
            br.close();

            if (nombre == null || frecMuestreoStr == null || canalesStr == null || numMuestrasStr == null || tiempoStr == null) {
                throw new NullPointerException("No se pueden manejar valores nulos");
            }

            int frecuenciaMuestreo = Integer.parseInt(frecMuestreoStr);
            int canales = Integer.parseInt(canalesStr);
            int numMuestras = Integer.parseInt(numMuestrasStr);
            int tiempo = Integer.parseInt(tiempoStr);

            if (frecuenciaMuestreo<=0 || numMuestras<=0 || tiempo<=0) {
                throw new IllegalArgumentException("Los valores para el muestreo deben de ser mayores a 0");
            }
            //Objeto generarWAV
            GeneraWAV creador= new GeneraWAV();
            creador.escribe(nombre, tiempo, frecuenciaMuestreo, numMuestras);

            //caso cuando no es extension.wav
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
