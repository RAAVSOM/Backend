package com.app.invest.domain.dto;

import com.app.invest.persistence.entity.Emprendedor;
import com.app.invest.persistence.entity.Inversionista;
import com.app.invest.persistence.entity.Negocio;
import com.app.invest.persistence.entity.Solicitud;
import lombok.Data;

@Data
public class InversionDTO {
    
    private Inversionista inversionista;
    private Solicitud solicitud;
    private Negocio negocio;
    private Emprendedor emprendedor;
}
