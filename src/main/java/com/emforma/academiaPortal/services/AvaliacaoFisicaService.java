package com.emforma.academiaPortal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emforma.academiaPortal.entities.AvaliacaoFisica;
import com.emforma.academiaPortal.repositories.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaService {
	
	@Autowired
	private AvaliacaoFisicaRepository AvaliacaoFisicaRepository;
	
	public List<AvaliacaoFisica> findAll(){
		return AvaliacaoFisicaRepository.findAll();
	}
	
	public AvaliacaoFisica findById(Long id) {
		Optional<AvaliacaoFisica>obj = AvaliacaoFisicaRepository.findById(id);
		return obj.get();
	}

	//public AvaliacaoFisica AvaliacaoFisicaFindById(Long id) {
		//return AvaliacaoFisicaRepository.findById(id).get();
	//}
}
