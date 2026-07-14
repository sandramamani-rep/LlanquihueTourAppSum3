
/**
 * Representa a un colaborador externo que presta servicios
 * a la agencia de turismo.
 *
 * Hereda de Empleado e implementa la interfaz Registrable.
 */
public class ColaboradorExterno extends Empleado implements Registrable{
    
    private String empresa;
    private String especialidad;
    
    /**
    * Construye un nuevo colaborador externo.
    *
    * @param empresa empresa a la que pertenece.
    * @param especialidad especialidad del colaborador.
    * @param rut rut.
    * @param nombre nombre.
    * @param telefono teléfono.
    * @param correo correo electrónico.
    * @param direccion dirección.
    * @param edad edad.
    * @param cargo cargo.
    * @param sueldo sueldo.
    * @param fechaContratacion fecha contratacion del empleado
    */
    public ColaboradorExterno(String empresa, String especialidad, Rut rut, String nombre, String telefono, String correo, Direccion direccion, int edad, String cargo, double sueldo, String fechaContratacion) {
        super(rut, nombre, telefono, correo, direccion, edad, cargo, sueldo, fechaContratacion);
        this.empresa = empresa;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "ColaboradorExterno{" + "empresa=" + empresa + ", especialidad=" + especialidad + '}';
    }
    
    /**
    * Genera un resumen con la información
    * del colaborador externo.
    *
    * @return resumen del colaborador.
    */
    @Override
    public String mostrarResumen() {
        
        return "Nombre: " + getNombre()
            + "\nCargo: " + getCargo()
            + "\nEmpresa: " + empresa
            + "\nEspecialidad: " + especialidad;
    }
    
}
