package com.emforma.academiaPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emforma.academiaPortal.entities.Instrutor;



//interface para trabalhar com o usuário Instrutor
@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {

}
