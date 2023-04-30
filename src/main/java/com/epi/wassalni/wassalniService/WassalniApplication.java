package com.epi.wassalni.wassalniService;

import com.epi.wassalni.wassalniService.dao.ConducteurRepository;
import com.epi.wassalni.wassalniService.dao.PersonneRepository;
import com.epi.wassalni.wassalniService.dao.VehiculeRepository;
import com.epi.wassalni.wassalniService.entities.Conducteur;
import com.epi.wassalni.wassalniService.entities.Personne;
import com.epi.wassalni.wassalniService.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WassalniApplication implements CommandLineRunner {
	@Autowired
	private VehiculeRepository vehiculeRepository;
	@Autowired
	private PersonneRepository personneRepository;

	@Autowired
	private ConducteurRepository conducteurRepository;

	public static void main(String[] args) {
		SpringApplication.run(WassalniApplication.class, args);
	}

	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/listeUsers").allowedOrigins("http://localhost:8080");
			}
		};
	}

	@Override public void run(String... args) throws Exception {
		vehiculeRepository.save(new Vehicule(11L,"BMW", "jaune","46505465"));
		vehiculeRepository.findAll().forEach(p -> p.toString());
		Personne p = new Personne();
		p.setUserName("bg01");
		p.setCin("04040404");
		p.setEmail("gmiden.belgacem@gmail.com");
		p.setGenre(1);
		p.setDateNaissance(LocalDateTime.of(1990, 01, 01, 0, 0));
		p.setAdresse("Tunis");
		p.setNom("gmidene");
		p.setPrenom("Belgacem");
		p.setPays("Tunisie");
		p.setRole("admin");
		personneRepository.save(p);
		Vehicule vehicule = new Vehicule();
		vehicule.setCouleur("noir");
		vehicule.setMarque("BMW");
		vehicule.setMatricule("132456");
		vehiculeRepository.save(vehicule);
		Conducteur conducteur = new Conducteur();
		conducteur.setUserName("hadhemiCosy");
		conducteur.setCin("04040404");
		conducteur.setEmail("belgacem.gmidene@gmail.com");
		conducteur.setDateNaissance(LocalDateTime.of(1990, 01, 01, 0, 0));
		conducteur.setAdresse("Tunis");
		conducteur.setNom("gmidene");
		conducteur.setPrenom("Belgacem");
		conducteur.setPays("Tunisie");
		conducteur.setRole("admin");
		conducteur.setTelephone(28061711);
		List<Vehicule> vehicules = new ArrayList<>();
		vehicules.add(vehicule);
		conducteur.setVehicules(vehicules);
		conducteur.setNbVoyages(45);
		conducteurRepository.save(conducteur);
	}
}
