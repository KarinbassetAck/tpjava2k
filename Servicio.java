package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Servicio {
    private int idServicio;
    private String NombreServicio;
    private Date FechaExpiracion;
    private int NumeroContrato;

    public Servicio(int idServicio, String nombreServicio, Date fechaExpiracion, int numeroContrato) {
        this.idServicio = idServicio;
        NombreServicio = nombreServicio;
        FechaExpiracion = fechaExpiracion;
        NumeroContrato = numeroContrato;
    }
}
