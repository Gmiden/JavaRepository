package com.epi.wassalni.wassalniService.controllers;
import com.epi.wassalni.wassalniService.dao.PersonneRepository;
import com.epi.wassalni.wassalniService.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PersonneRestService {

    @Autowired PersonneRepository personneRepository;

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeUsers")
    public List<Personne> listeUsers(){
        return personneRepository.findAll();
    }
    @GetMapping(value = "/listeUsers/{id}")
    public Personne listeUsers(@PathVariable(name = "id")Long id){
        return personneRepository.findById(id).get();
    }
    @PutMapping(value = "/listeUsers/{id}")
    public Personne update(@PathVariable(name = "id")Long id, @RequestBody Personne personne){
        personne.setId(id);
        return personneRepository.save(personne);
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/listeUsers")
    public Personne save(@RequestBody Personne personne){
        return personneRepository.save(personne);
    }
    @DeleteMapping(value = "/listeUsers/{id}")
    public void delete(@PathVariable(name = "id")Long id){
        personneRepository.deleteById(id);
    }
}
