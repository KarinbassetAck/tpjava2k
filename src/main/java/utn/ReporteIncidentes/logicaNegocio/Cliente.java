package utn.ReporteIncidentes.logicaNegocio;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {
    private String razonSocial;
    private String cuit;
    private List<String> serviciosContratados;
    // Constructor
    public Cliente(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.serviciosContratados = new ArrayList<>();
    }
    // Método para agregar un servicio contratado
    public void contratarServicio(String servicio) {
        serviciosContratados.add(servicio);
        System.out.println("¡Servicio contratado con éxito!");
    }
    // Método para mostrar los servicios contratados
    public void mostrarServiciosContratados() {
        System.out.println("Servicios contratados por " + razonSocial + " (CUIT: " + cuit + "):");
        for (String servicio : serviciosContratados) {
            System.out.println("-" + servicio);
        }
    }
}
