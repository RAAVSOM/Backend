package com.app.invest.api.controller;

import com.app.invest.domain.dto.SolicitudDTO;
import com.app.invest.domain.service.InversionistaService;
import com.app.invest.domain.service.NegocioService;
import com.app.invest.domain.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;
    @Autowired
    private InversionistaService inversionistaService;
    @Autowired
    private NegocioService negocioService;
    
    //--------------funciones inversionista-------------
    @GetMapping("cargarsolicitud/{idN}-{idI}")
    public List<SolicitudDTO> cargarSolicitudI(@PathVariable Long idN,@PathVariable Long idI ){
        return solicitudService.cargarSolicitudes(negocioService.buscarNegocio(idN),inversionistaService.buscarInversionista(idI) );
    }
    
    @PostMapping("solicitudAgregar")
    public String agregarSolicitud(@RequestBody SolicitudDTO solicitudDTO){
        solicitudService.agregarSolicitud(solicitudDTO);
        return "exito";
    }
    
    @DeleteMapping("eliminarsolicitud/{id}")
    public String eliminarSolicitud(@PathVariable Long id){
        return solicitudService.eliminarsolicitud(id);
    }
    
    @PutMapping("actualizarsolicitud/{id}")
    public String actualizarSolicitud(@PathVariable Long id, @RequestBody SolicitudDTO solicitudDTO){
        return solicitudService.actualizarSolicitud(id, solicitudDTO);
    }
    
    @GetMapping("versolicitudi/{id}")
    public SolicitudDTO verSolicitudI(@PathVariable Long id){
        return solicitudService.verSolicitudI(id);
    }
    
    //------------funciones emprendedor----------------
    @GetMapping("cargarsolicitudn/{id}")
    public List<SolicitudDTO> cargarSolicitudE(@PathVariable Long id){
        return solicitudService.cargarSolicitudesNegocio(negocioService.buscarNegocio(id));
    }
    
    @GetMapping("versolicitude/{id}")
    public SolicitudDTO verSolicitudE(@PathVariable Long id){
        return solicitudService.verSolicitudE(id);
    }
    
    @DeleteMapping("concluir/{id}")
    public void concluirSubasta(@PathVariable Long id){
        solicitudService.concluirSubasta(negocioService.buscarNegocio(id));
    }
}
