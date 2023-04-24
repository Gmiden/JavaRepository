package com.epi.wassalni.wassalniService.controllers;

import com.epi.wassalni.wassalniService.dao.VehiculeRepository;
import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class VehiculeRestService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    @GetMapping(value = "/listeVehicules")
    public List<Vehicule> listeVehicules(){
        return vehiculeRepository.findAll();
    }
    @GetMapping(value = "/listeVehicules/{id}")
    public Vehicule listeVehicules(@PathVariable(name = "id")Long id){
        return vehiculeRepository.findById(id).get();
    }
    @PutMapping(value = "/listeVehicules/{id}")
    public Vehicule update(@PathVariable(name = "id")Long id, @RequestBody Vehicule vehicule){
        vehicule.setId(id);
        return vehiculeRepository.save(vehicule);
    }
    @PostMapping(value = "/listeVehicules")
    public Vehicule save(@RequestBody Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }
    @DeleteMapping(value = "/listeVehicules/{id}")
    public void delete(@PathVariable(name = "id")Long id){
         vehiculeRepository.deleteById(id);
    }
}
