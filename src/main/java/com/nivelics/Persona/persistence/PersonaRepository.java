package com.nivelics.Persona.persistence;

import com.nivelics.Persona.persistence.crud.PersonaJpaRepository;
import com.nivelics.Persona.persistence.entity.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class PersonaRepository {
    @Autowired
    private PersonaJpaRepository personaJpaRepository;

    public List<PersonaEntity> getByName(String name){
        return  personaJpaRepository.findByNombre(name);
    }

    public Optional<PersonaEntity> getById(int id){
        return  personaJpaRepository.findById(id);
    }

    public void deleteById(int id){
        personaJpaRepository.deleteById(id);
    }

    public PersonaEntity savePersona(PersonaEntity newPerson){
        return personaJpaRepository.save(newPerson);
    }

    public void updatePersona(PersonaEntity editPerson, int id){
        personaJpaRepository.updatePersona(editPerson.getNombre(), editPerson.getEdad(), editPerson.getCelular(), id );
    }
}
