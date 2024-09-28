import java.util.*;

public class Ejercicio0 {
    public static void imprimeSubCad(String s1, int l, int h) {
        System.out.println(s1.substring(l, h+1));
    }

    static int longSubPal(String s1){
        int n = s1.length();
        boolean tabla[][] = new boolean[n][n];
        int mLong = 1;

        //Lenamos elementos en diagonal como true 
        for (int i = 0; i < n; ++i) {
            tabla[i][i] = true;
        }

        int inicio = 0;
        // REvisamos paliondromos con longitud 2
        for (int i = 0; i < n-1; ++i) {
            if(s1.charAt(i) == s1.charAt(i+1)){
                tabla[i][i+1] = true;
                inicio = 1;
                mLong = 2;
            }
        }

        //REvisamos palondromos con longitud mayor q 2
        
        for(int k = 3; k<=n; ++k){
            for (int i = 0; i < n-k+1; ++i) {
                int j = i+k-1;
                if (tabla[i+1][j-1] && s1.charAt(i) == s1.charAt(j)) {
                    tabla[i][j] = true;

                    if(k>mLong){
                        inicio = i;
                        mLong = k;
                    }
                }
            }
        }

        //Se imprime la subcadena palindromo más larga
        System.out.print("El palindromo de subcadena más largo es: ");
        imprimeSubCad(s1, inicio, inicio+mLong-1);
        return mLong;

    }
    
    public static void main(String[] args) {
        String cad1 = "anitalavalatinajustocomolohaceanita";

        System.out.println("La cadena dada es: "+cad1);

        //Encuentro e imprimo la subcadena con el palindromo más largo
        System.out.println("La subcadena palindromo más largo es: "+ longSubPal(cad1));
    }
}
