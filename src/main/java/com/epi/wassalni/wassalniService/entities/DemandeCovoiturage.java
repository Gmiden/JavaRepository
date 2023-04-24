package com.epi.wassalni.wassalniService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class DemandeCovoiturage implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Personne client;
    @OneToOne
    private Trajet trajet;
    private double prixPropose;
    private Integer nbPlacesAreserver;


}
