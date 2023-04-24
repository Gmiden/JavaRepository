package com.epi.wassalni.wassalniService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Conducteur extends Personne{
    @OneToMany
    private List<Vehicule> vehicules;
}
