package mx.fi.unam.poo.g1.p12;

import java.lang.Math;
import mx.fi.unam.poo.g1.p12.CuentaBanco;

/**
 * Clase Cliente, implementa Runnable y se encarga de realizar las transacciones de deposito y retiro de dinero
 * en la cuenta de un banco.
 * @author GOnzález Falcón Luis Adrián
 * @version Noviembre 2024
 */
public class Cliente implements Runnable{
    //cliente tiene referencia de una cuenta banco, se intenta que todos los clientes referencien a un solo objeto banco
    private CuentaBanco cuenta;

    /**
     * Constructor de la clase Cliente
     * @param cuenta CuentaBanco, referencia a la cuenta de banco que se va a utilizar para realizar las transacciones
     */
    public Cliente(CuentaBanco cuenta){
        this.cuenta = cuenta;
    }

    /**
     * Método run, se encarga   de realizar las transacciones de deposito y retiro de dinero en la cuenta de un banco.
     */
    @Override
    public void run() {
        //realizar 4 transacciones
        for (int i = 0; i < 4; i++) {
            if (Math.random() < 0.5) {
                //depositar
                cuenta.depositar(Math.random()*900); //depositar 3 veces cantidades de dinero
            }else{
                cuenta.retirar(Math.random()*900);   //retirar 3 veces cantidades de dinero
            }
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
