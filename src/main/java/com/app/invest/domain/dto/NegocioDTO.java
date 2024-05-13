package com.app.invest.domain.dto;

import com.app.invest.persistence.entity.Emprendedor;
import com.app.invest.persistence.entity.Solicitud;
import lombok.Data;

import java.util.List;

@Data
public class NegocioDTO {
    private boolean aprobado;
    private Emprendedor emprendedor;
    private List<Solicitud> solicitudes;
}
