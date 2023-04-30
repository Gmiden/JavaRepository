package com.epi.wassalni.wassalniService.controllers;

import com.epi.wassalni.wassalniService.dao.VoyageRepository;
import com.epi.wassalni.wassalniService.entities.Conducteur;
import com.epi.wassalni.wassalniService.entities.Voyage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class VoyageRestService {
    @Autowired
    private VoyageRepository voyageRepository;
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeVoyages")
    public List<Voyage> listeVoyages(){
        return voyageRepository.findAll();
    }
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeVoyages/{id}")
    public Voyage listeVoyages(@PathVariable(name = "id")Long id){
        return voyageRepository.findById(id).get();
    }
    @PutMapping(value = "/api/listeVoyages/{id}")
    public Voyage update(@PathVariable(name = "id")Long id, @RequestBody Voyage voyage){
        voyage.setId(id);
        return voyageRepository.save(voyage);
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/api/listeVoyages")
    public Voyage save(@RequestBody Voyage voyage){
        return voyageRepository.save(voyage);
    }
    @DeleteMapping(value = "/api/listeVoyages/{id}")
    public void delete(@PathVariable(name = "id")Long id){
        voyageRepository.deleteById(id);
    }
}
