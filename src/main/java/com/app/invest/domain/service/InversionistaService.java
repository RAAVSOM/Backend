package com.app.invest.domain.service;

import com.app.invest.domain.dto.InversionistaDTO;
import com.app.invest.domain.mapper.InversionistaMapper;
import com.app.invest.persistence.entity.Inversionista;
import com.app.invest.persistence.repository.InversionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InversionistaService {
    
    @Autowired
    private InversionistaRepository inversionistaRepository;
    
    public InversionistaDTO save(InversionistaDTO inversionistaDTO){
        inversionistaRepository.save(InversionistaMapper.toEntinty(inversionistaDTO));
        return inversionistaDTO;
    }
    
    public Inversionista buscarInversionista(Long id){
        return inversionistaRepository.findById(id).orElse(null);
    }
}
