package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase programador que se extiende de clase base Empleado
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Programador extends Empleado{
    /**
     * Método constructor para crear una clase Programador
     * @param nombre -> Nombre del Programador
     * @param direccion -> Dirección del Programadors
     * @param nombreTrabajo -> Nombre del Programador
     * @param salario -> Salario del Programador
     */
    public Programador(String nombre, String direccion, String nombreTrabajo, double salario){
        super(nombre, direccion, nombreTrabajo, salario);
    }

    @Override
    public void calcularBonos(){
        //salario + 10%
        setSalario(getSalario() * 1.10);
    }

    @Override
    public String reporteDesempeño(){
        return "- El desempeño del Programador es muy malo, no es eficaz y es muy lento en los proyectos que la empresa necesita";
    }

    @Override
    public String manejoProyectos(){
        return "- Trabajando en la corrección del desastre de código que otro compañero programador hizo";
    }    
}
