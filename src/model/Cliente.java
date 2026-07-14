
/**
 * Representa a un cliente de la agencia de turismo Llanquihue Tour.
 */
public class Cliente extends Persona {

    private int idCliente;
    private String pasaporte;

    /**
     * Constructor de la clase Cliente.
     *
     * @param idCliente identificador único del cliente
     * @param pasaporte número de pasaporte del cliente
     * @param rut rut del cliente
     * @param nombre nombre completo del cliente
     * @param telefono teléfono del cliente
     * @param correo correo electrónico del cliente
     * @param direccion dirección del cliente
     * @param edad edad del cliente
     */
    public Cliente(Rut rut,
                   String nombre,
                   String telefono,
                   String correo,
                   Direccion direccion,
                   int edad,
                   int idCliente,
                   String pasaporte) {
        super(rut, nombre, telefono, correo, direccion, edad);
        this.idCliente = idCliente;
        this.pasaporte = pasaporte;
    }

    /**
     * Muestra la información completa del cliente.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ID Cliente : " + idCliente);
        System.out.println("Pasaporte  : " + pasaporte);
    }

    // Métodos get y set

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", pasaporte=" + pasaporte+
                ", " + super.toString() +
                '}';
        }
    }