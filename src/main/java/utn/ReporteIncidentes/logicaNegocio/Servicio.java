package utn.ReporteIncidentes.logicaNegocio;
import lombok.Data;
@Data
public class Servicio {
    private String nombre;
    private double costoMensual;

    // Constructor
    public Servicio(String nombre, double costoMensual) {
        this.nombre = nombre;
        this.costoMensual = costoMensual;
    }

    // Método toString para obtener una representación en cadena del servicio
    @Override
    public String toString() {
        return "Servicio: " + nombre + " (Costo Mensual: $" + costoMensual + ")";
    }
}
