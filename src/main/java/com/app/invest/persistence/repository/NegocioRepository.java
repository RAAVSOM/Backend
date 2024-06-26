package com.app.invest.persistence.repository;

import com.app.invest.persistence.entity.Emprendedor;
import com.app.invest.persistence.entity.Negocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NegocioRepository extends JpaRepository<Negocio, Long>{
    public List<Negocio> findAllByAprobado(boolean aprobado);
    public List<Negocio> findAllByEmprendedor(Emprendedor emprendedor);
}
