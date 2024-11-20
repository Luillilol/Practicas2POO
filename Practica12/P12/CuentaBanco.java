package mx.fi.unam.poo.g1.p12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Clase CuentaBanco
 * Clase que simula una cuenta de banco con un saldo inicial y métodos para depositar y retirar dinero.
 * @author González Falcón Luis Adrián
 * @version Noviembre 2024
 */
public class CuentaBanco {
    private double saldo;
    Lock lock = new ReentrantLock();
    //tiene un atributo de lock donde interactuarán las otras clases usuario

    /**
     * Constructor de la clase CuentaBanco
     * @param saldo saldo inicial de la cuenta
     */
    public CuentaBanco(double saldo){
        setSaldo(saldo);
    }
    /**
     * Método set de la variable saldo
     * @param saldo saldo inicial de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método get de la variable saldo
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que simula un depósito de dinero en la cuenta usando hilos y lock
     * @param cantidad cantidad de dinero a depositar
     */
    public void depositar(double cantidad){
        lock.lock(); //cierra la puerta para realizar el trámtire
        try {
            this.saldo +=cantidad;
            //imprimir el nombre del hilo que realizó el traimte
            System.out.println(Thread.currentThread().getName() +" depositó: "+cantidad);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Saldo actual: "+getSaldo());
        lock.unlock(); //abre la puerta una vez ya se realizó la transacción
    }

    /**
     * Método que simula un retiro de dinero en la cuenta usando hilos y lock
     * @param cantidad cantidad de dinero a retirar
     */
    public void retirar(double cantidad){
        lock.lock();
        try {
            if (getSaldo() - cantidad < 0) {
                //mensaje de que el hilo X intentó retirar dinero pero saldo insuficiente
                System.out.println(Thread.currentThread().getName() +" intentó retirar dinero pero excedía con el saldo actual ");
            }else{
                this.saldo -= cantidad;
                // mensaje de que el hilo X retiró dindero
                System.out.println(Thread.currentThread().getName() +" retiró: "+cantidad);
                System.out.println("Saldo actual: "+ getSaldo());
            }
        } catch (Exception e) {
            e.getMessage();
        }
        lock.unlock();
    }    
}