package com.epi.wassalni.wassalniService.controllers;

import com.epi.wassalni.wassalniService.dao.ConducteurRepository;
import com.epi.wassalni.wassalniService.dao.NoteRepository;
import com.epi.wassalni.wassalniService.entities.Conducteur;
import com.epi.wassalni.wassalniService.entities.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class NoteRestService {
    @Autowired NoteRepository noteRepository;

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeNotes")
    public List<Note> listeNotes(){
        return noteRepository.findAll();
    }
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/api/listeNotes/{id}")
    public Note listeNotes(@PathVariable(name = "id")Long id){
        return noteRepository.findById(id).get();
    }
    @PutMapping(value = "/api/listeNotes/{id}")
    public Note update(@PathVariable(name = "id")Long id, @RequestBody Note note){
        note.setId(id);
        return noteRepository.save(note);
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/api/listeNotes")
    public Note save(@RequestBody Note note){
        return noteRepository.save(note);
    }
    @DeleteMapping(value = "/api/listeNotes/{id}")
    public void delete(@PathVariable(name = "id")Long id){
        noteRepository.deleteById(id);
    }
}
