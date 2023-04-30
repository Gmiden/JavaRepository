package com.epi.wassalni.wassalniService.controllers;

import com.epi.wassalni.wassalniService.dao.ConducteurRepository;
import com.epi.wassalni.wassalniService.entities.Conducteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ConducteurRestService {

    @Autowired ConducteurRepository conducteurRepository;

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeConducteurs")
    public List<Conducteur> listeConducteurs(){
        return conducteurRepository.findAll();
    }
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeConducteurs/{id}")
    public Conducteur listeConducteurs(@PathVariable(name = "id")Long id){
        return conducteurRepository.findById(id).get();
    }
    @PutMapping(value = "/api/listeConducteurs/{id}")
    public Conducteur update(@PathVariable(name = "id")Long id, @RequestBody Conducteur conducteur){
        conducteur.setId(id);
        return conducteurRepository.save(conducteur);
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/api/listeConducteurs")
    public Conducteur save(@RequestBody Conducteur conducteur){
        return conducteurRepository.save(conducteur);
    }
    @DeleteMapping(value = "/api/listeConducteurs/{id}")
    public void delete(@PathVariable(name = "id")Long id){
        conducteurRepository.deleteById(id);
    }
}
