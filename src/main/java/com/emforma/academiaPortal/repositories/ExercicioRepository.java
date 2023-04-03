package com.emforma.academiaPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emforma.academiaPortal.entities.Exercicio;



//interface para trabalhar com o usuário Exercicio
@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {

}
