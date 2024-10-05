package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Manager que se extienede de Clase Base Empleado
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024 
 */

public class Manager extends Empleado{

    /**
     * Método constructor para crear una clase Manager
     * @param nombre -> Nombre del Mánager
     * @param direccion -> Dirección del Manager
     * @param nombreTrabajo -> Nombre del Trabajo
     * @param salario -> Salario del Manager
     */
    public Manager(String nombre, String direccion, String nombreTrabajo, double salario){
        super(nombre, direccion, nombreTrabajo, salario);
    }

    //setters y getters ya están heredados y no los queremos sobreescribir
    //Calcular bonos, generar reportes de desempeño, manejo de proyectos
    // generar reportes y manejo de proyectos de pueden represemtar con cadenas

    
    @Override
    public void calcularBonos(){
        //salario + 30%
        setSalario(getSalario() * 1.30);
    }

    @Override
    public String reporteDesempeño(){
        return "- El desempeño del Mánager fue bueno, mejor que el promedio";
    }

    @Override
    public String manejoProyectos(){
        return "- Supervisando al equipo de desarrolladores y programadores encargados de crear la nueva aplicación móvil.";
    }
}
