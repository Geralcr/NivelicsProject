package com.nivelics.Persona.service;

import com.nivelics.Persona.persistence.PersonaRepository;
import com.nivelics.Persona.persistence.entity.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServImpl implements IPersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<PersonaEntity> FindByName(String nombre){

        return personaRepository.getByName(nombre);
    }

    public PersonaEntity SavePersona(PersonaEntity personaEntity){
        return personaRepository.savePersona(personaEntity);
    }

    public Optional<PersonaEntity> FindById(int id){
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
