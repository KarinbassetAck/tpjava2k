package utn.ReporteIncidentes;
import java.util.Scanner;
import utn.ReporteIncidentes.logicaNegocio.Cliente;
import utn.ReporteIncidentes.logicaNegocio.Servicio;
import utn.ReporteIncidentes.logicaNegocio.Tecnico;
import utn.ReporteIncidentes.logicaNegocio.Incidente;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    List<Incidente> incidentes = new ArrayList<>();
    incidentes.add(new Incidente("Problema de red", "Redes"));
    incidentes.add(new Incidente("Problema de software", "Software"));
    Cliente cliente1 = new Cliente("Empresa A", "12345678901");
    Cliente cliente2 = new Cliente("Empresa B", "23456789012");
    Tecnico tecnico1 = new Tecnico("Juan", List.of("Redes", "Seguridad"));
    Tecnico tecnico2 = new Tecnico("Maria", List.of("Soporte"));

    Incidente incidente1 = new Incidente("Problema de red", "Redes");
    Incidente incidente2 = new Incidente("Problema de software", "Software");
    Servicio servicio1 = new Servicio("Electricidad",2500);
    Servicio servicio2 = new Servicio("Gas",4200);
    Servicio servicio3 = new Servicio("Cloacas",5000);
    cliente1.contratarServicio(servicio1);
    cliente1.contratarServicio(servicio3);
    cliente1.contratarServicio(servicio2);
    cliente2.contratarServicio(servicio1);
    cliente2.contratarServicio(servicio2);
    cliente1.mostrarServiciosContratados();
    cliente2.mostrarServiciosContratados();

    tecnico1.asignarIncidente(incidente1);
    tecnico1.asignarIncidente(incidente2);
    tecnico1.mostrarIncidentesAsignados();
    tecnico2.asignarIncidente(incidente1);
    tecnico2.asignarIncidente(incidente2);
    tecnico2.mostrarIncidentesAsignados();

        while (!salir) {
            System.out.println("============= Menú Principal ===============");
            System.out.println("1. Ver información del Cliente");
            System.out.println("2. Ver información del Técnico");
            System.out.println("3. Ver información del Incidente");
            System.out.println("4. Ver información del Servicio");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.println("Información del Cliente:");
                    System.out.println("Razón Social: " + cliente1.getRazonSocial());
                    System.out.println("CUIT: " + cliente1.getCuit());
                    break;
                case 2:
                    System.out.println("Información del Técnico:");
                    System.out.println("Nombre: " + tecnico1.getNombre());
                    System.out.println("Especialidades: " + tecnico1.getEspecialidades());
                    break;
                case 3:
                    System.out.println("Información del Incidente:");
                    System.out.println("Nombre: " + incidente1.getNombre());
                    System.out.println("Especialidad: " + incidente1.getEspecialidad());
                    break;
                case 4:
                    System.out.println("Información del Servicio:");
                    System.out.println("Nombre: " + servicio1.getNombre());
                    System.out.println("Costo Mensual: " + servicio1.getCostoMensual());
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        System.out.println("Saliendo del programa. ¡Hasta luego!");
    }

}
