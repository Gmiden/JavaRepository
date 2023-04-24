package com.epi.wassalni.wassalniService.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1",types =Vehicule.class)
public interface VehiculeProjection {
    public String getCouleur();
}
