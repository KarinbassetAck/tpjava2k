package utn.ReporteIncidentes.logicaNegocio;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Tecnico {
    private String nombre;
    private List<String> especialidades;
    private List<Incidente> incidentesAsignados;

    // Constructor
    public Tecnico(String nombre, List<String> especialidades) {
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.incidentesAsignados = new ArrayList<>();
    }

    // Método para asignar un incidente al técnico si coincide con sus especialidades
    public void asignarIncidente(Incidente incidente) {
        if (coincideEspecialidad(incidente.getEspecialidad())) {
            incidentesAsignados.add(incidente);
            System.out.println("Incidente asignado a " + nombre + ": " + incidente);
        } else {
            System.out.println("El técnico " + nombre + " no puede resolver el incidente.");
        }
    }
    // Método para mostrar los incidentes asignados al técnico
    public void mostrarIncidentesAsignados() {
        System.out.println("Incidentes asignados a " + nombre + ":");
        for (Incidente incidente : incidentesAsignados) {
            System.out.println("- " + incidente);
        }
    }
    // Método para verificar si el técnico tiene la especialidad requerida
    private boolean coincideEspecialidad(String especialidad) {
        return especialidades.contains(especialidad);
    }
}