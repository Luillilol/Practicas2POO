package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.Empleado;
/**
 * Clase Programador
 * @author González Falcón Luis Adrián
 * @version Octubre 2024
 */
public class Programador extends Empleado{
    /**
     * Método constructor para crear objetos Programador
     * @param nombre -> Atributo nombres del programador
     * @param rol -> Rol que desempeña
     */
    public Programador(String nombre, String rol){
        super(nombre, rol);
    }

    @Override
    public double calcularSalario(){
        return 50000.0;
    }
}
