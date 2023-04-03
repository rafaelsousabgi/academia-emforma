package com.emforma.academiaPortal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emforma.academiaPortal.entities.GrupoMuscular;
import com.emforma.academiaPortal.repositories.GrupoMuscularRepository;

@Service
public class GrupoMuscularService {
	
	@Autowired
	private GrupoMuscularRepository grupoMuscularRepository;
	
	public List<GrupoMuscular> findAll(){
		return grupoMuscularRepository.findAll();
	}
	
	public GrupoMuscular findById(Long id) {
		Optional<GrupoMuscular>obj = grupoMuscularRepository.findById(id);
		return obj.get();
	}

	//public GrupoMuscular grupoMuscularFindById(Long id) {
		//return grupoMuscularRepository.findById(id).get();
	//}
}
