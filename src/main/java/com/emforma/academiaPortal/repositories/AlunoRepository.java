package com.emforma.academiaPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emforma.academiaPortal.entities.Aluno;



//interface para trabalhar com o usuário Aluno
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
