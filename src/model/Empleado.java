
/**
 * Representa a un empleado de la agencia de turismo Llanquihue Tour 
 * 
 */
public class Empleado extends Persona{
    private String cargo;
    private double sueldo;
    private String fechaContratacion;
    
    /**
     * Constructor de la clase Empleado
     * @param cargo cargo del empleado
     * @param sueldo sueldo del empleado
     * @param fechaContratacion fecha de contratacion del empleado formato DDMMAAAA
     * @param rut
     * @param nombre
     * @param telefono
     * @param correo
     * @param direccion
     * @param edad 
     */

    public Empleado(Rut rut, 
                    String nombre, 
                    String telefono, 
                    String correo, 
                    Direccion direccion, 
                    int edad,
                    String cargo, 
                    double sueldo, 
                    String fechaContratacion) {
        
        super(rut, nombre, telefono, correo, direccion, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaContratacion = fechaContratacion;
    }
    
    /**
     * Muestra la información completa de un empleado.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cargo  : " + cargo);
        System.out.println("Sueldo  : " + sueldo);
        System.out.println("Fecha contratacion  : " + fechaContratacion);

    }
    
    // Métodos get y set
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + 
                ", sueldo=" + sueldo + 
                ", fechaContratacion=" + fechaContratacion +
                ", " + super.toString() +
                '}';
    }
    
    
}
