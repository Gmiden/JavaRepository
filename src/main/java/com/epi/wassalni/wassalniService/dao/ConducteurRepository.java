package com.epi.wassalni.wassalniService.dao;

import com.epi.wassalni.wassalniService.entities.Conducteur;
import com.epi.wassalni.wassalniService.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface ConducteurRepository extends JpaRepository<Conducteur,Long> {
}
