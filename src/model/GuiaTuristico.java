
/**
 * Representa a un guía turístico de la agencia.
 *
 * Hereda de Empleado e implementa la interfaz Registrable.
 */
public class GuiaTuristico extends Empleado implements Registrable {
    private String idioma;
    private int aniosExperiencia;

    /**
    * Construye un nuevo guía turístico.
    *
    * @param idioma idioma que domina el guía.
    * @param aniosExperiencia años de experiencia laboral.
    * @param rut rut del guía.
    * @param nombre nombre completo.
    * @param telefono teléfono.
    * @param correo correo electrónico.
    * @param direccion dirección.
    * @param edad edad.
    * @param cargo cargo desempeñado.
    * @param sueldo sueldo del empleado.
    * @param fechaContratacion fecha contratacion del empleado
    */
    public GuiaTuristico(String idioma, int aniosExperiencia, Rut rut, String nombre, String telefono, String correo, Direccion direccion, int edad, String cargo, double sueldo, String fechaContratacion) {
        super(rut, nombre, telefono, correo, direccion, edad, cargo, sueldo, fechaContratacion);
        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" + "idioma=" + idioma + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    /**
    * Genera un resumen con la información del guía turístico.
    *
    * @return resumen del guía.
    */
    @Override
    public String mostrarResumen() {
        return "Nombre: " + getNombre()
            + "\nRUT: " + getRut()
            + "\nIdioma: " + idioma
            + "\nExperiencia: " + aniosExperiencia + " años";
    }
    
    
}
