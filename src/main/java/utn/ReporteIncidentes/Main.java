package utn.ReporteIncidentes;

import utn.ReporteIncidentes.logicaNegocio.Cliente;
import utn.ReporteIncidentes.logicaNegocio.Tecnico;
import utn.ReporteIncidentes.logicaNegocio.Incidente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    // Crear lista de incidentes
    List<Incidente> incidentes = new ArrayList<>();
    incidentes.add(new Incidente("Problema de red", "Redes"));
    incidentes.add(new Incidente("Problema de software", "Software"));
    Cliente cliente1 = new Cliente("Empresa CorreoArgentino", "12345678901");
    Cliente cliente2 = new Cliente("Empresa FuerzaLista", "23456789012");
    Tecnico tecnico1 = new Tecnico("Juan", List.of("Redes", "Seguridad"));
    Tecnico tecnico2 = new Tecnico("Maria", List.of("Soporte"));

    Incidente incidente1 = new Incidente("Problema de red", "Redes");
    Incidente incidente2 = new Incidente("Problema de software", "Software");
    cliente1.contratarServicio("Servicio A");
    cliente1.contratarServicio("Servicio B");
    cliente1.contratarServicio("Servicio C");
    cliente2.contratarServicio("Servicio B");
    cliente2.contratarServicio("Servicio C");
    cliente1.mostrarServiciosContratados();
    cliente2.mostrarServiciosContratados();

    tecnico1.asignarIncidente(incidente1);
    tecnico1.asignarIncidente(incidente2);
    tecnico1.mostrarIncidentesAsignados();
    tecnico2.asignarIncidente(incidente1);
    tecnico2.asignarIncidente(incidente2);
    tecnico2.mostrarIncidentesAsignados();
    }
}
