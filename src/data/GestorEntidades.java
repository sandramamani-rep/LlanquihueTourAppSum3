
import java.util.ArrayList;



/**
 * Crea un nuevo gestor de entidades e inicializa
 * la colección donde se almacenarán los registros.
 */
public class GestorEntidades {
    /**
    * Colección que almacena todas las entidades registradas.
    */
    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();

    }
    
    /**
     * Carga datos de ejemplo en la colección.
     */
    public ArrayList<Registrable> cargarDatos() {

        try {
            // Guías turísticos
            entidades.add(new GuiaTuristico(
                    "Español - Inglés",
                    8,
                    new Rut("12345678-9"),
                    "José Pérez",
                    "987654321",
                    "jose@tour.cl",
                    new Direccion("Los Pinos", 123, "Puerto Varas", "Los Lagos"),
                    35,
                    "Guía Turístico",
                    850000,
                    "01/03/2022"
            ));
        } catch (RutInvalidoException ex) {
            System.out.println("Error al crear el guía turístico: "+ ex.getMessage());
        }

        try {
            entidades.add(new Recepcionista(
                    "Mañana",
                    new Rut("11222333-4"),
                    "María Soto",
                    "998877665",
                    "maria@tour.cl",
                    new Direccion("San Martín", 455, "Puerto Montt", "Los Lagos"),
                    30,
                    "Recepcioonista",
                    800000,
                    "15/06/2023"
            ));
        } catch (RutInvalidoException ex) {
            System.out.println("Error al crear el guía turístico: "+ ex.getMessage());
        }

        // Vehículos
        entidades.add(new Vehiculo(
                "ABCD11",
                "Minibús",
                18
        ));

        entidades.add(new Vehiculo(
                "EFGH22",
                "Van",
                10
        ));

        try {
            // Colaboradores externos
            entidades.add(new ColaboradorExterno(
                    "Transportes Patagonia",
                    "Conductor Turístico",
                    new Rut("99888777-6"),
                    "Pedro González",
                    "956789123",
                    "pedro@patagonia.cl",
                    new Direccion("O'Higgins", 450, "Frutillar", "Los Lagos"),
                    42,
                    "Colaborador externo",
                    700000,
                    "10/01/2024"
            ));
        } catch (RutInvalidoException ex) {
            System.out.println("Error al crear el guía turístico: "+ ex.getMessage());
        }
        
        return entidades;
    }
    
    /**
    * Recorre todas las entidades registradas y genera
    * un resumen de su información utilizando polimorfismo.
    *
    * @return texto con la información de todas las entidades.
    */
    public String mostrarEntidades() {

        StringBuilder sb = new StringBuilder();

        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {

                sb.append("===== GUÍA TURÍSTICO =====\n");

            } else if (entidad instanceof Vehiculo) {

                sb.append("===== VEHÍCULO =====\n");

            } else if (entidad instanceof ColaboradorExterno) {

                sb.append("===== COLABORADOR EXTERNO =====\n");
                
            } else if(entidad instanceof Recepcionista){
                
                sb.append("===== RECEPCIONISTA =====\n");

            }
            
            sb.append(entidad.mostrarResumen());
            sb.append("\n\n");
        }

        return sb.toString();
    }
    
    /**
    * Agrega una nueva entidad a la colección.
    *
    * @param entidad entidad que será registrada.
    */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }
    
    /**
    * Obtiene la lista de entidades registradas.
    *
    * @return colección de entidades registradas.
    */
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}
