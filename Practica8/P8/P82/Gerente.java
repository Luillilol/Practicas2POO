package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.Empleado;

/**
 * Clase Gerente
 * @author González Falcón Luis Adrián
 * @version Octubre 2024
 */
public class Gerente extends Empleado{
    /**
     * Método constructor para crear objetos Gerente
     * @param nombre -> Atributo nombre del gerente
     * @param rol -> Rol que desempeña
     */
    public Gerente(String nombre, String rol){
        super(nombre, rol);
    }

    @Override
    public double calcularSalario() {
        return 85000.00;
    }

    
}