package com.epi.wassalni.wassalniService;

import com.epi.wassalni.wassalniService.dao.VehiculeRepository;
import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WassalniApplication implements CommandLineRunner {
	@Autowired
	private VehiculeRepository vehiculeRepository;
	public static void main(String[] args) {
		SpringApplication.run(WassalniApplication.class, args);
	}

	@Override public void run(String... args) throws Exception {
		vehiculeRepository.save(new Vehicule(null,"BMW","jaune"));
		vehiculeRepository.findAll().forEach(p->p.toString());

	}
}
