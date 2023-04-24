package com.epi.wassalni.wassalniService.dao;

import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    @RestResource(path ="/byMarque")
    public List<Vehicule>findByMarque(@Param("mq")String marque);

    @RestResource(path = "/byMarquePage")
    public Page<Vehicule> findByMarque(@Param("mq")String marque, Pageable pageable);
}
