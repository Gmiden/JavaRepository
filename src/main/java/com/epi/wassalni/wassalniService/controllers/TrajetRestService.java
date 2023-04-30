package com.epi.wassalni.wassalniService.controllers;

import com.epi.wassalni.wassalniService.dao.TrajetRepository;
import com.epi.wassalni.wassalniService.dao.VehiculeRepository;
import com.epi.wassalni.wassalniService.entities.Trajet;
import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrajetRestService {
    @Autowired
    private TrajetRepository trajetRepository;

    @GetMapping(value = "/listeTrajets")
    public List<Trajet> listeVehicules(){
        return trajetRepository.findAll();
    }
    @GetMapping(value = "/listeTrajets/{id}")
    public Trajet listeVehicules(@PathVariable(name = "id")Long id){
        return trajetRepository.findById(id).get();
    }
    @PutMapping(value = "/listeTrajets/{id}")
    public Trajet update(@PathVariable(name = "id")Long id, @RequestBody Trajet trajet){
        trajet.setId(id);
        return trajetRepository.save(trajet);
    }
    @PostMapping(value = "/listeTrajets")
    public Trajet save(@RequestBody Trajet trajet){
        return trajetRepository.save(trajet);
    }
    @DeleteMapping(value = "/listeTrajets/{id}")
    public void delete(@PathVariable(name = "id")Long id){
        trajetRepository.deleteById(id);
    }
}
