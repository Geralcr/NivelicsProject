package com.nivelics.Persona.domain.service;

import com.nivelics.Persona.persistence.PersonaRepository;
import com.nivelics.Persona.persistence.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> FindByName(String nombre){

        return personaRepository.getByName(nombre);
    }

    public  Persona SavePersona(Persona persona){
        return personaRepository.savePersona(persona);
    }

    public Optional<Persona> FindById(int id){
        return personaRepository.getById(id);
    }
    /*

    public  void UpdatePersona (Persona editPerson, int id){
        personaRepository.updatePersona(editPerson, id);
    }
*/
    public boolean DeleteById(int id){
        return FindById(id).map(persona -> {
            personaRepository.deleteById(id);
            return true;
        }).orElse(false);

    }

}
