package com.app.invest.persistence.repository;

import com.app.invest.persistence.entity.Inversionista;
import com.app.invest.persistence.entity.Negocio;
import com.app.invest.persistence.entity.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    public List<Solicitud> findAllByNegocio(Negocio negocio);
    public List<Solicitud> findAllByNegocioAndInversionista(Negocio negocio, Inversionista inversionista);
    public void deleteAllByNegocio(Negocio negocio);
}
