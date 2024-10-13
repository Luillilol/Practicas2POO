package mx.unam.fi.poo.g1.p82;

/**
 * Clase Empleado
 * @author González Falcón Luis Adrián
 * @version Octubre 2024
 */
public class Empleado{
    private String nombre, rol;

    /**
     * Método constructor para crear la clase EMpleado
     * @param nombre -> Atributo para el nombre del empleado
     * @param rol -> Atributo del rol que desempeña el empleado
     */
    public Empleado(String nombre, String rol){
        setNombre(nombre);
        setRol(rol);
    }

    /**
     * Método set del atributo nombre
     * @param nombre -> Valor nombre a cambiar
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método get del atrbuto nombres
     * @return -> Atributo nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Método set del atributo Rol
     * @param rol -> Valor de rol a cambiar
     */
    public void setRol(String rol){
        this.rol = rol;
    }
    /**
     * Método get del atributo rol
     * @return -> Atributo rol
     */
    public String getRol(){
        return rol;
    }

    /**
     * Método que calcula el salario del empleado
     * @return -> Salario del empleado
     */
    public double calcularSalario(){
        return 0.0;
    }
}