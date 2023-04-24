package com.epi.wassalni.wassalniService.dao;

import com.epi.wassalni.wassalniService.entities.Personne;
import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
