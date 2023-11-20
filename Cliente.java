package Entidades;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {
    private int idcliente;
    private String RazonSocial;
    private int CUIL;

    public Cliente(int idcliente, String razonSocial, int CUIL) {
        this.idcliente = idcliente;
        RazonSocial = razonSocial;
        this.CUIL = CUIL;
    }
}
