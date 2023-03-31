package com.emforma.academiaPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emforma.academiaPortal.entities.Aluno;



//interface para trabalhar com o usuário Aluno
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
