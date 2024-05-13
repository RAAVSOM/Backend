package com.app.invest.api.controller;

import com.app.invest.domain.dto.InversionDTO;
import com.app.invest.domain.mapper.InversionMapper;
import com.app.invest.domain.service.InversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InversionController {
    @Autowired
    private InversionService inversionService;

    @PostMapping("aceptarSolicitud")
    public void aceptarSolicitud(@RequestBody InversionDTO inversionDTO){
        inversionService.aceptarSolicitud(InversionMapper.toEntinty(inversionDTO));
    }
}
