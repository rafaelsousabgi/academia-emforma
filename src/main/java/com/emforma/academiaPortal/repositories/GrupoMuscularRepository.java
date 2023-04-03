package com.emforma.academiaPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emforma.academiaPortal.entities.GrupoMuscular;



//interface para trabalhar com o usuário GrupoMuscular
@Repository
public interface GrupoMuscularRepository extends JpaRepository<GrupoMuscular, Long> {

}
