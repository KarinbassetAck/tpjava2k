package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Especialidad {
    private int idEspecialidad;
    private String NombreEspecialidad;

    public Especialidad(int idEspecialidad, String nombreEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        NombreEspecialidad = nombreEspecialidad;
    }
}
