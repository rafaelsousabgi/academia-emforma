package com.emforma.academiaPortal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emforma.academiaPortal.entities.Instrutor;
import com.emforma.academiaPortal.repositories.InstrutorRepository;

@Service
public class InstrutorService {
	
	@Autowired
	private InstrutorRepository instrutorRepository;
	
	public List<Instrutor> findAll(){
		return instrutorRepository.findAll();
	}
	
	public Instrutor findById(Long id) {
		Optional<Instrutor>obj = instrutorRepository.findById(id);
		return obj.get();
	}
	
	public Instrutor insert(Instrutor obj) {
		return instrutorRepository.save(obj);
	}


	//public Instrutor alunoFindById(Long id) {
		//return alunoRepository.findById(id).get();
	//}
}
