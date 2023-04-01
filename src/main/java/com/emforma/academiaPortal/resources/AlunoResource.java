package com.emforma.academiaPortal.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService alunoService;

	//Metodo para Salvar um aluno
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		List<Aluno> list= alunoService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um aluno por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Aluno> findById(@PathVariable Long id){
		Aluno obj = alunoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
