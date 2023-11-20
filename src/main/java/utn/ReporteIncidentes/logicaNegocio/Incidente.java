package utn.ReporteIncidentes.logicaNegocio;
import lombok.Data;
@Data
public class Incidente {
    private String nombre;
    private String especialidad;

    // Constructor
    public Incidente(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Método toString para obtener una representación en cadena del incidente
    @Override
    public String toString() {
        return "Incidente: " + nombre + " (Especialidad: " + especialidad + ")";
    }
}
