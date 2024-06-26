package com.app.invest.domain.dto;

import com.app.invest.persistence.entity.Inversionista;
import lombok.Data;

@Data
public class SolicitudDTO {
    private int valor_solicitud;
    private float porcentaje_rentabilidad;
    private float porcentaje_liquidez;
    private float nivel_riezgotolerado;
    private Inversionista inversionista;
}
