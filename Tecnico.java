package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tecnico {
    private int idTecnico;
    private String NombreTecnico;
    private String ApellidoTecnico;
    private int CUILtecnico;

    public Tecnico(int idTecnico, String nombreTecnico, String apellidoTecnico, int CUILtecnico) {
        this.idTecnico = idTecnico;
        NombreTecnico = nombreTecnico;
        ApellidoTecnico = apellidoTecnico;
        this.CUILtecnico = CUILtecnico;
    }
}
