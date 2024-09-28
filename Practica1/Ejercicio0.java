import java.util.Scanner;
public class Ejercicio0{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean bandera = false;

        System.out.print("Ingresa un número: ");
        int n = entrada.nextInt();
        entrada.close();

        if(n % 2 == 0){
            bandera=true;
            System.out.print(bandera);
        }else{

            System.out.print(bandera);
        }



    }  
}
//d
