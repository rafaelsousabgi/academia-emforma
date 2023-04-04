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

import com.emforma.academiaPortal.entities.Exercicio;
import com.emforma.academiaPortal.services.ExercicioService;

@RestController
@RequestMapping(value = "/exercicios")
public class ExercicioResource {
	
	@Autowired
	private ExercicioService exercicioService;

	//Metodo para Salvar um exercicio
	@GetMapping
	public ResponseEntity<List<Exercicio>> findAll(){
		List<Exercicio> list= exercicioService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um exercicio por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Exercicio> findById(@PathVariable Long id){
		Exercicio obj = exercicioService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Exercicio> insert(@RequestBody Exercicio obj){
	  obj =	exercicioService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
	
}
