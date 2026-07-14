
/**
 * Representa un vehículo utilizado por la agencia
 * para realizar servicios turísticos.
 *
 * Implementa la interfaz Registrable.
 */
public class Vehiculo implements Registrable{

   private String patente;
   private String tipo;
   private int capacidad;
   
   /**
    * Construye un nuevo vehículo.
    *
    * @param patente patente del vehículo.
    * @param tipo tipo de vehículo.
    * @param capacidad capacidad máxima de pasajeros.
    */
    public Vehiculo(String patente, String tipo, int capacidad) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
    
    /**
    * Genera un resumen con la información del vehículo.
    *
    * @return resumen del vehículo.
    */
    @Override
    public String mostrarResumen() {
        return "Patente: " + patente
            + "\nTipo: " + tipo
            + "\nCapacidad: " + capacidad + " pasajeros";
        }
   
}
