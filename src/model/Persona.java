
/**
 * Representa a una persona de la agencia de turismo Llanquihue Tour 
 *
 */
public class Persona {
    // Atributos del persona
    private Rut rut;
    private String nombre;
    private String telefono;
    private String correo;
    private Direccion direccion;
    private int edad;

    /**
     * Constructor de la clase Persona
     * @param rut rut de la persona
     * @param nombre nombre completo de la persona
     * @param telefono telefono de la persona
     * @param correo correo de la persona
     * @param direccion direccion de la persona
     * @param edad edad de la persona
     */
    public Persona(Rut rut, String nombre, String telefono, String correo, Direccion direccion, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    /**
     * Muestra la información completa de una persona.
     */
    public void mostrarInformacion() {
        System.out.println("===== DATOS DE LA PERSONA =====");
        System.out.println("Rut  : " + rut);
        System.out.println("Nombre  : " + nombre);
        System.out.println("Telefono  : " + telefono);
        System.out.println("Correo  : " + correo );
        System.out.println("Direccion  : " + direccion.mostrarDireccion());
        System.out.println("Edad  : " + edad);

    }
    // Métodos get y set
    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + 
                ", nombre=" + nombre + 
                ", telefono=" + telefono + 
                ", correo=" + correo + 
                ", direccion=" + direccion.toString() + 
                ", edad=" + edad + '}';
    }
    
}
