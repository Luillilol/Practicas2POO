package mx.unam.fi.poo.g1.p7;

/**
 * Clase base Empleado
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */
public class Empleado {
    private String nombre, direccion, nombreTrabajo;
    private double salario;

    /**
     * Método constructor de para construir clases Empleado
     * @param nombre -> Atributo para el nombre del Empleado
     * @param direccion -> Dirección del empleado
     * @param nombreTrabajo -> Nombre del trabajo del empleado
     * @param salario ->Salario del empleado
     */
    public Empleado(String nombre, String direccion, String nombreTrabajo, double salario){
        setNombre(nombre);
        setDireccion(direccion);
        setNombreTrabajo(nombreTrabajo);
        setSalario(salario);
    }

    //SETTERS Y GETTERS
    /**
     * Método set para el atributo nombre
     * @param nombre ->Para cambiar el dato del atributo nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método get para el atributo nombre
     * @return nombre -> Regresa el atributo nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método set para el atributo direccion
     * @param direccion -> Para cambiar el atributo dirección
     */
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    /**
     * Método get para el atributo direccion
     * @return direccion -> Regresa el atributo dirección
     */
    public String getDireccion(){
        return direccion;
    }

    /**
     * Método set para el atributo nombreTrabajo
     * @param nombreTrabajo -> Para cambiar el atributo nombreTrabajo
     */
    public void setNombreTrabajo(String nombreTrabajo){
        this.nombreTrabajo = nombreTrabajo;
    }
    /**
     * Método get para el atributo nombreTrabajo
     * @return nombreTrabjo -> Regresa el atributo nombreTrabajo
     */
    public String getNombreTrabajo(){
        return nombreTrabajo;
    }

    /**
     * Método set para el atributo salario
     * @param salario -> Para cambiar el atributo salario
     */
    public void setSalario(double salario){
        this.salario = salario;
    }
    /**
     * Método get para el atributo salario
     * @return direccion -> Regresa el atributo salario
     */
    public double getSalario(){
        return salario;
    }

    //METODOS 
    //Calcular bonos, generar reportes de desempeño, manejo de proyectos
    // generar reportes y manejo de proyectos de pueden represemtar con cadenas

    /**
     * Método que aumenta el salario un porcentaje 
     */
    public void calcularBonos(){
        //aumentar porcentaje de salario
        setSalario(getSalario() * 1.10);
    }

    /**
     * Método que reporta el desempeño del empleado
     * @return -> Desempeño del empleado
     */
    public String reporteDesempeño(){
        return "Reporte Desempeño";
    }

    /**
     * Método que indica el proyecto que se está realizando
     * @return -> Datos del proyecto actual
     */
    public String manejoProyectos(){
        return "Manejo Proyectos";
    }

    @Override
    public String toString(){
        return "\nNombre: "+getNombre()+
                "\nPuesto: "+getNombreTrabajo()+
                "\nDirección: "+ getDireccion()+
                "\nSalario: "+ getSalario()
                +"\n";
    }
    
}