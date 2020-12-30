package com.nivelics.Persona.service;

import com.nivelics.Persona.persistence.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    List<PersonaEntity> FindByName(String nombre);

    PersonaEntity SavePersona(PersonaEntity personaEntity);

    Optional<PersonaEntity> FindById(int id);

    boolean UpdatePersona (PersonaEntity editPerson, int id);

    boolean DeleteById(int id);
}
