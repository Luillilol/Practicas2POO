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
            String nombre = br.readLine();
            int frecuenciaMuestreo = Integer.parseInt(br.readLine());
            int canales = Integer.parseInt(br.readLine()); // se ignora porque siempre será 1
            int numMuestras = Integer.parseInt(br.readLine());
            int tiempo = Integer.parseInt(br.readLine());;
            br.close();
            //Validar datos
            //Objeto generarWAV
            GeneraWAV creador= new GeneraWAV();
            creador.escribe(nombre, tiempo, frecuenciaMuestreo, numMuestras);


            

            

        } catch (FileNotFoundException e) {
            
        }catch (IOException e) {
            
        }
        
    }
}
