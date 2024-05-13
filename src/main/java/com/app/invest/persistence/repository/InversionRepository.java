package com.app.invest.persistence.repository;

import com.app.invest.persistence.entity.Inversion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InversionRepository extends JpaRepository<Inversion, Long>{
    
}
