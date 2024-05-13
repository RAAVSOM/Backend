package com.app.invest.domain.dto;

import com.app.invest.persistence.entity.Negocio;
import com.app.invest.persistence.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class EmprendedorDTO {
    
    private Usuario usuario;
    private List<Negocio> negocios;
    
}
