package com.emforma.academiaPortal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<Aluno> findAll(){
		return alunoRepository.findAll();
	}
	
	public Aluno findById(Long id) {
		Optional<Aluno>obj = alunoRepository.findById(id);
		return obj.get();
	}

	//public Aluno alunoFindById(Long id) {
		//return alunoRepository.findById(id).get();
	//}
}
