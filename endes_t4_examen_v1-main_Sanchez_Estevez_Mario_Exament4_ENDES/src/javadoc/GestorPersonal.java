package javadoc;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase gestiona una lista de empleados con sus datos básicos como nombre, identificación y sueldo.
 *
 * @author Mario
 * @version 23/02/2024
 */
public class GestorPersonal {

    /**
     * Lista de los empleados gestionados por esta clase.
     */
    private List<Empleado> empleados;

    /**
     * Constructor que crea un nuevo gestor de personal sin empleados.
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Agrega un nuevo empleado a la lista.
     *
     * @param empleado El nuevo empleado a agregar.
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Elimina un empleado de la lista por su identificación.
     *
     * @param id La identificación del empleado a eliminar.
     * @return `true` si el empleado fue encontrado y eliminado, o `false` si no se encontró ningún empleado con la identificación especificada.
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     * Busca un empleado por su identificación y cambia su sueldo.
     *
     * @param id La identificación del empleado a buscar.
     * @param nuevoSueldo El nuevo sueldo del empleado.
     * @return `true` si el empleado fue encontrado y su sueldo se actualizó, o `false` si no se encontró ningún empleado con la identificación especificada.
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene una copia de la lista de empleados.
     *
     * @return Una copia de la lista de empleados.
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
