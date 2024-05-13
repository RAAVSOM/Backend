package com.app.invest.domain.dto;

import com.app.invest.persistence.entity.Inversion;
import com.app.invest.persistence.entity.Solicitud;
import com.app.invest.persistence.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class InversionistaDTO {
    private Usuario usuario;
    private List<Solicitud> solicitudes;
    private List<Inversion> inversiones;
}
