package com.emforma.academiaPortal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emforma.academiaPortal.entities.FichaTreino;
import com.emforma.academiaPortal.repositories.FichaTreinoRepository;

@Service
public class FichaTreinoService {
	
	@Autowired
	private FichaTreinoRepository fichaTreinoRepository;
	
	public List<FichaTreino> findAll(){
		return fichaTreinoRepository.findAll();
	}
	
	public FichaTreino findById(Long id) {
		Optional<FichaTreino>obj = fichaTreinoRepository.findById(id);
		return obj.get();
	}

	//public FichaTreino FichaTreinoFindById(Long id) {
		//return FichaTreinoRepository.findById(id).get();
	//}
}
