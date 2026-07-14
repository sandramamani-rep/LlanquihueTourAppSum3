
/**
 * Representa a un recepcionista de la agencia de turismo.
 *
 * Hereda de Empleado e implementa la interfaz Registrable.
 */
public class Recepcionista extends Empleado implements Registrable {

    /**
     * Turno de trabajo del recepcionista.
     */
    private String turno;

    /**
     * Constructor de la clase Recepcionista.
     *
     * @param turno turno de trabajo.
     * @param rut rut del empleado.
     * @param nombre nombre completo.
     * @param telefono teléfono.
     * @param correo correo electrónico.
     * @param direccion dirección.
     * @param edad edad.
     * @param cargo cargo del empleado.
     * @param sueldo sueldo del empleado.
     * @param fechaContratacion fecha contratacion del empleado
     */
    public Recepcionista(
            String turno,
            Rut rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            int edad,
            String cargo,
            double sueldo, String fechaContratacion) {
        super(rut, nombre, telefono, correo, direccion, edad, cargo, sueldo, fechaContratacion);
        this.turno = turno;
    }

    /**
     * Obtiene el turno del recepcionista.
     *
     * @return turno.
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Modifica el turno del recepcionista.
     *
     * @param turno nuevo turno.
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    /**
     * Devuelve la información del recepcionista.
     *
     * @return representación en texto.
     */
    @Override
    public String toString() {
        return "Recepcionista{"
                + "turno=" + turno
                + "} " + super.toString();
    }

    /**
     * Genera un resumen de la información del recepcionista.
     *
     * @return resumen del recepcionista.
     */
    @Override
    public String mostrarResumen() {
        return "Nombre: " + getNombre()
            + "\nRUT: " + getRut()
            + "\nTurno: " + turno;
    }

}
