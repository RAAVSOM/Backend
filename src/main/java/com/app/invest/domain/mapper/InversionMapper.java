package com.app.invest.domain.mapper;

import com.app.invest.domain.dto.InversionDTO;
import com.app.invest.persistence.entity.Inversion;

public class InversionMapper {
    public static Inversion toEntinty(InversionDTO inversionDTO){
        Inversion inversion = new Inversion();
        inversion.setSolicitud(inversionDTO.getSolicitud());
        inversion.setNegocio(inversionDTO.getNegocio());
        inversion.setEmprendedor(inversionDTO.getEmprendedor());
        inversion.setInversionista(inversionDTO.getInversionista());
        return inversion;
    }

    public static InversionDTO toDTO(Inversion inversion){
        InversionDTO inversionDTO = new InversionDTO();
        inversionDTO.setSolicitud(inversion.getSolicitud());
        inversionDTO.setNegocio(inversion.getNegocio());
        inversionDTO.setEmprendedor(inversion.getEmprendedor());
        inversionDTO.setInversionista(inversion.getInversionista());
        return inversionDTO;
    }
}
