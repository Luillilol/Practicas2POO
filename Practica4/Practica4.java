import java.util.Scanner;

class CuentaBanco{
    String nombre;
    int cuenta;
    double depositoInicial;

    public CuentaBanco(String n, int c, double dI){
        this.nombre = n;
        this.cuenta = c;
        this.depositoInicial = dI;
    }
    public CuentaBanco(String n, int c){
        this.nombre = n;
        this.cuenta = c;
        this.depositoInicial = 0.0;
    }    
    public void depositar(double cantidad){
        depositoInicial += cantidad;
        System.out.println("Has depositado $"+cantidad);
    }
    public void retirarDinero(double cantidad){
        if (cantidad <= depositoInicial) {
            depositoInicial -=cantidad;;
            System.out.println("Has retirado $"+cantidad);
        }else{
            System.out.println("No tienes suficiente dinero");
        }
    }
    public void detallesCuenta(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cuenta : "+cuenta);
        System.out.println("Dinero: "+depositoInicial);
        System.out.println();
    }
}


public class Practica4 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        CuentaBanco cuenta1 = new CuentaBanco("Falcon", 32009, 5300.50);
        CuentaBanco cuenta2 = new CuentaBanco("Santiago", 12452);
        int opcion;
        double cantidad;
        cuenta1.detallesCuenta();
        cuenta2.detallesCuenta();

        do {
            System.out.println("¿Qué deseas hacer?- - - - - - - - - - - - - - - -");
            System.out.println("1) Depositar\n2) Retirar dinero\n3) Imprimir información de la cuenta\n4) Salir");
            opcion = es.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la cantidad a depositar: ");
                    cantidad = es.nextDouble();
                    cuenta1.depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad de retirar: ");
                    cantidad = es.nextDouble();
                    cuenta1.retirarDinero(cantidad);
                    break;
                case 3:
                    System.out.println("Detalles: ");
                    cuenta1.detallesCuenta();
                    break;
            }
        } while (opcion != 4);

    }
}
