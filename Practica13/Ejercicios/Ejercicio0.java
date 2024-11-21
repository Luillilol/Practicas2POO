import java.util.LinkedList;
import java.util.*;

public class Ejercicio0 {
    private static Ejercicio0 instance;
    private Queue<String> colaDocumentos;
    private Ejercicio0(){
        colaDocumentos = new LinkedList<>();
    }


    public static Ejercicio0 getInstance(){
        if (instance == null) { 
            instance = new Ejercicio0();
        }
        return instance;
    }

    public void agregarDocumento(String documento){
        colaDocumentos.add(documento);
        System.out.println("Documento \"" + documento + "\" agregado a la cola de ...");

    }

    public void imprimirDocumento(){
        if (colaDocumentos.isEmpty()) {
            System.out.println("NO hay elementos es la cola de impresion");
        }else{
            String documento = colaDocumentos.poll();
            System.out.println("Imprimiento documento: "+ documento);
        }
    }

    public static void main(String[] args) {
        Ejercicio0 impresora = Ejercicio0.getInstance();
        impresora.agregarDocumento("Documento 1");
        impresora.agregarDocumento("Documento 2");
        impresora.agregarDocumento("Documento 3");
        
        impresora.imprimirDocumento();
        impresora.imprimirDocumento();
        impresora.imprimirDocumento();
    }

}