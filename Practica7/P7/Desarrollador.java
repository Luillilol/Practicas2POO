package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Desarrollador que se extiende de clase base Empleado
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Desarrollador extends Empleado{

    /**
     * Método constructor para crear una clase Desarrollador
     * @param nombre -> Nombre del Desarrollador
     * @param direccion -> Dirección del Desarrollador 
     * @param nombreTrabajo -> Nombre del trabajo
     * @param salario -> Salario del Desarrollador
     */
    public Desarrollador(String nombre, String direccion, String nombreTrabajo, double salario){
        super(nombre, direccion, nombreTrabajo, salario);
    }


    @Override
    public void calcularBonos(){
        //salario + 20%
        setSalario(getSalario() * 1.20);
    }

    @Override
    public String reporteDesempeño(){
        return "- El desempeño del Desarrollador fue normal, los resultados no salieron de la expectativa y no hubo ningún problema.";
    }

    @Override
    public String manejoProyectos(){
        return "- Trabajando actualmente en la planificación de un software completo para el registro de alumnos a un sistema nacional de colegios";
    }
    

    
}
