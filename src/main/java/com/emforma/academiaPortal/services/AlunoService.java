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
	
	public Aluno insert(Aluno obj) {
		return alunoRepository.save(obj);
	}
	
	public void delete(Long id) {
		alunoRepository.deleteById(id);
	}
	
	public Aluno update(Long id, Aluno obj) {
		Aluno entity = alunoRepository.getReferenceById(id);
		updateData(entity, obj);
		return alunoRepository.save(entity);
	}

	private void updateData(Aluno entity, Aluno obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setTelefone(obj.getTelefone());
		entity.setUf(obj.getUf());
		entity.setCidade(obj.getCidade());
		entity.setBairro(obj.getBairro());
	}

	//public Aluno alunoFindById(Long id) {
		//return alunoRepository.findById(id).get();
	//}
}
