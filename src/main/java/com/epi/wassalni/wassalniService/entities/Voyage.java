package com.epi.wassalni.wassalniService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Voyage implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Personne> clients;
    @OneToOne
    private Trajet trajet;
    @OneToMany
    private List<Note> notes;
    private Integer placesDisponibles;

}
