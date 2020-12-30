package com.nivelics.Persona.persistence.crud;

import com.nivelics.Persona.persistence.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaJpaRepository extends JpaRepository<Persona, Integer> {

    List<Persona> findByNombre(String nombre);
    //List<Persona> updatePersona(Persona editePersona, int id);
}
