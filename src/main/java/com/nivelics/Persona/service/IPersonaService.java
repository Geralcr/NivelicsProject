package com.nivelics.Persona.service;

import com.nivelics.Persona.persistence.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<PersonaEntity> FindByName(String nombre);

    public PersonaEntity SavePersona(PersonaEntity personaEntity);

    public Optional<PersonaEntity> FindById(int id);

    //public  void UpdatePersona (PersonaEntity editPerson, int id);

    public boolean DeleteById(int id);
}
