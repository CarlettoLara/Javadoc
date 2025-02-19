package Clases;


/**
 * Representa un empleado en una empresa.
 * @author Carlos
 * @version 1.0
 * @since 2024
 */
public class Empleados {
    private final  String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente =1;
    private String direccion;

    /**
     * Constructor de la clase Empleados.
     * @param nombre Nombre del empleado.
     */

    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;

    }
    /**
     * Cambia la sección del empleado.
     *
     * @param seccion Nueva sección del empleado.
     * @deprecated Este metodo será reemplazado por un nuevo sistema de gestión de secciones.
     * @see #devuelveDatos()
     */

    public void cambiaSeccion(String seccion){
        this.seccion = seccion;

    }

    /**
     * Devuelve la información del empleado en formato de cadena de texto.
     *
     * @return Una cadena con el nombre, la sección y el ID del empleado.
     */
    public String devuelveDatos(){

        return "El nombre es : " + nombre + " y la seccion es " + seccion + "y el id=" + id;

    }
    /**
     * Obtiene el próximo ID disponible para un nuevo empleado.
     *
     * @return El ID que se asignará al siguiente empleado registrado.
     */
    public static int dameIdSiguiente(){
        return idSiguiente;
    }
}

