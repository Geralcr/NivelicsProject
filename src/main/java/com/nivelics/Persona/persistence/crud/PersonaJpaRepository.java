package com.nivelics.Persona.persistence.crud;

import com.nivelics.Persona.persistence.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, Integer> {

    List<PersonaEntity> findByNombre(String nombre);
    //List<Persona> updatePersona(Persona editePersona, int id);
}
