import java.util.*;

public class Ejercicio1 {
    public static String palabrasReversa(String s1) {
        //Creamos objeto StringBuilder y revertimos la cadena dada
        StringBuilder sb = new StringBuilder(s1);        
        String invertida = sb.reverse().toString();
        
        //Dividimos la cadena invertida en palabras;
        
        String[] palabras = invertida.split(" ");

        //Creamos StringBUilder para almacenar las palabras invertidas
        StringBuilder si = new StringBuilder();
        

        //iteramos sobre cada palabras, la invertimos y agregamos a la cadena resultante
        for (String tmp : palabras) {
            sb = new StringBuilder(tmp);
            si.append(sb.reverse() + " ");
        }

        //Eliminamos espacios sobrantes y regresamos la cadena con palabras invertidas
        si.deleteCharAt(si.length() - 1);
        return si.toString();
    }

    public static void main(String[] args) {
        String cad1 = "Palabras Invertidas en una cadena dada";

        System.out.println("LA cadena dada es: " + cad1);
        System.out.println("LA nueva cadena después de invertir las palabras es: " + palabrasReversa(cad1));
    }
}
