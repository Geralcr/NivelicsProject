package com.nivelics.Persona.persistence.crud;

import com.nivelics.Persona.persistence.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, Integer> {

    List<PersonaEntity> findByNombre(String nombre);
    @Query(value="Update persona SET nombre = ?1, edad = ?2, celular = ?3 WHERE id = ?4 RETURNING *",nativeQuery = true)
    PersonaEntity updatePersona(String nombre, Integer edad, String celular, Integer id);
}
