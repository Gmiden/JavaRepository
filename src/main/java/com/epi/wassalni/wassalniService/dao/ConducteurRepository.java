package com.epi.wassalni.wassalniService.dao;

import com.epi.wassalni.wassalniService.entities.Conducteur;
import com.epi.wassalni.wassalniService.entities.Personne;
import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ConducteurRepository extends JpaRepository<Conducteur,Long> {
    @CrossOrigin(origins = "*")
    @RestResource(path ="/byUserName")
    public List<Conducteur> findByUserName(@Param("userName")String userName);
}
