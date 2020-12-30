package com.nivelics.Persona.web.controller;

import com.nivelics.Persona.service.PersonaServImpl;
import com.nivelics.Persona.persistence.entity.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaServImpl personaServImpl;

    @GetMapping("/findByName/{name}")
    public List<PersonaEntity> findByName(@PathVariable("name") String nombre){
        return personaServImpl.FindByName(nombre);
    }


    @PostMapping("/savePersona")
    public PersonaEntity savePersona(@RequestBody PersonaEntity personaEntity){
        return personaServImpl.SavePersona(personaEntity);
    }

    @GetMapping("/findById/{id}")
    public Optional<PersonaEntity> findById(@PathVariable("id") int id){
        return  personaServImpl.FindById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable("id") int id){
        return  personaServImpl.DeleteById(id);
    }

    @PostMapping("/updatePersona/{id}")
    public boolean updatePersona( @RequestBody PersonaEntity personaEntity, @PathVariable("id") int id){
        return personaServImpl.UpdatePersona(personaEntity,id);
    }
}
