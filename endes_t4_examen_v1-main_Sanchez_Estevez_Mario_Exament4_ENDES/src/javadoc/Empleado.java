package javadoc;

/**
 * Esta clase representa un empleado con sus datos básicos como nombre, identificación y sueldo.
 *@author Mario
 *@version 23/02/2024
 */
public class Empleado {

    /**
     * Nombre del empleado.
     */
    private String nombre;

    /**
     * Identificación del empleado.
     */
    private String id;

    /**
     * Sueldo del empleado.
     */
    private double sueldo;

    /**
     * Constructor que crea un nuevo empleado con los datos especificados.
     *
     * @param nombre El nombre del empleado.
     * @param id La identificación del empleado.
     * @param sueldo El sueldo del empleado.
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la identificación del empleado.
     *
     * @return La identificación del empleado.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el sueldo del empleado.
     *
     * @return El sueldo del empleado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado.
     *
     * @param sueldo El nuevo sueldo del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Incrementa el sueldo del empleado en la cantidad especificada.
     *
     * @param incremento La cantidad a incrementar al sueldo.
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Devuelve una representación textual del objeto `Empleado`.
     *
     * @return Una representación textual del objeto `Empleado`.
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}