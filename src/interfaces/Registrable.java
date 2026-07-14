
/**
 * Define el comportamiento común para todas las entidades
 * que pueden mostrar un resumen de su información.
 */
public interface Registrable {
    
    /**
     * Obtiene un resumen de la información de la entidad.
     *
     * @return cadena con la información resumida.
     */
    String mostrarResumen();
    
}
