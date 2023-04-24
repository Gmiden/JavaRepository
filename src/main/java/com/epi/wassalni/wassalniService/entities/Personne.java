package com.epi.wassalni.wassalniService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Personne implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private  String image;
    private String email;
    private String password;
    private String cin;
    private LocalDateTime dateNaissance;
    private Integer genre;
    private String rue;
    private String numero;
    private String codePostal;
    private String localite;
    private String pays;
    private String role;


}
