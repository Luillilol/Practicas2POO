package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.Empleado;

public class Gerente extends Empleado{
    public Gerente(String nombre, String rol){
        super(nombre, rol);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

    
}