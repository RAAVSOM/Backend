package com.app.invest.api.controller;

import com.app.invest.domain.dto.InversionistaDTO;
import com.app.invest.domain.service.InversionistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InversionistaController {
    
    @Autowired
    private InversionistaService inversionistaService;
    
    @PostMapping("/registerInversionista")
    public String registerInversionista(@RequestBody InversionistaDTO inversionistaDTO){
        inversionistaService.save(inversionistaDTO);
        return "exito";
    }
}
