package com.emforma.academiaPortal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emforma.academiaPortal.entities.Exercicio;
import com.emforma.academiaPortal.repositories.ExercicioRepository;

@Service
public class ExercicioService {
	
	@Autowired
	private ExercicioRepository exercicioRepository;
	
	public List<Exercicio> findAll(){
		return exercicioRepository.findAll();
	}
	
	public Exercicio findById(Long id) {
		Optional<Exercicio>obj = exercicioRepository.findById(id);
		return obj.get();
	}
	
	public Exercicio insert(Exercicio obj) {
		return exercicioRepository.save(obj);
	}


	//public Exercicio ExercicioFindById(Long id) {
		//return ExercicioRepository.findById(id).get();
	//}
}
