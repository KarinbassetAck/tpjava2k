package Entidades;

import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.TimeZone;
@Getter
@Setter
public class Incidente {

        private int idIncidente;
        private String NombreIncidente;

        private Date FechaIncidente;
        private Date FechaEstimadaResolucion;
        private TimeZone HoraIncidente;
        private String DescripcionIncidente;
        private String TipodeProblema;
        private int TiempoEstimadoResolucion;

        public Incidente(int idIncidente, String nombreIncidente, Date fechaIncidente, Date fechaEstimadaResolucion, TimeZone horaIncidente, String descripcionIncidente, String tipodeProblema, int tiempoEstimadoResolucion) {
                this.idIncidente = idIncidente;
                NombreIncidente = nombreIncidente;
                FechaIncidente = fechaIncidente;
                FechaEstimadaResolucion = fechaEstimadaResolucion;
                HoraIncidente = horaIncidente;
                DescripcionIncidente = descripcionIncidente;
                TipodeProblema = tipodeProblema;
                TiempoEstimadoResolucion = tiempoEstimadoResolucion;
        }
}
