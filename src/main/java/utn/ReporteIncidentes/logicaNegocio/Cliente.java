package utn.ReporteIncidentes.logicaNegocio;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {
    private String razonSocial;
    private String cuit;
    private List<Servicio> serviciosContratados;
    // Constructor
    public Cliente(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.serviciosContratados = new ArrayList<>();
    }
    // Método para agregar un servicio contratado
    public void contratarServicio(Servicio servicio1) {
        serviciosContratados.add(servicio1);
        System.out.println("¡Servicio contratado con éxito!");
    }
    // Método para mostrar los servicios contratados
    public void mostrarServiciosContratados() {
        System.out.println("Servicios contratados por " + razonSocial + " (CUIT: " + cuit + "):");
        for (Servicio servicio : serviciosContratados) {
            System.out.println("-" + servicio);
        }
    }
}
