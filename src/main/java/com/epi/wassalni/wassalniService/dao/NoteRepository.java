package com.epi.wassalni.wassalniService.dao;

import com.epi.wassalni.wassalniService.entities.Note;
import com.epi.wassalni.wassalniService.entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note,Long> {

}
