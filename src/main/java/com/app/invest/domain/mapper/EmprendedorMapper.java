package com.app.invest.domain.mapper;

import com.app.invest.domain.dto.EmprendedorDTO;
import com.app.invest.persistence.entity.Emprendedor;

public class EmprendedorMapper {
    public static Emprendedor toEntinty(EmprendedorDTO emprendedorDTO){
        Emprendedor emprendedor = new Emprendedor();
        emprendedor.setUsuario(emprendedorDTO.getUsuario());
        emprendedor.setNegocios(emprendedorDTO.getNegocios());
        return emprendedor;
    }

    public static EmprendedorDTO toDTO(Emprendedor emprendedor){
        EmprendedorDTO emprendedorDTO = new EmprendedorDTO();
        emprendedorDTO.setUsuario(emprendedor.getUsuario());
        emprendedorDTO.setNegocios(emprendedor.getNegocios());
        return emprendedorDTO;
    }
}
