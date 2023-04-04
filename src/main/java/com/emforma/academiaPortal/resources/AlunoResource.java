package com.emforma.academiaPortal.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService alunoService;

	//Metodo para buscar um aluno no banco
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
	
	//inserir um objeto do tipo aluno no banco
	
	@PostMapping
	public ResponseEntity<Aluno> insert(@RequestBody Aluno obj){
	  obj =	alunoService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
	
}
