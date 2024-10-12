package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.Empleado;

public class Programador extends Empleado{
    public Programador(String nombre, String rol){
        super(nombre, rol);
    }

    @Override
    public double calcularSalario(){
        return 0.0;
    }
}
