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

import com.emforma.academiaPortal.entities.Instrutor;
import com.emforma.academiaPortal.services.InstrutorService;

@RestController
@RequestMapping(value = "/instrutores")
public class InstrutorResource {
	
	@Autowired
	private InstrutorService instrutorService;

	//Metodo para Salvar um Instrutor
	@GetMapping
	public ResponseEntity<List<Instrutor>> findAll(){
		List<Instrutor> list= instrutorService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um Instrutor por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Instrutor> findById(@PathVariable Long id){
		Instrutor obj = instrutorService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Instrutor> insert(@RequestBody Instrutor obj){
	  obj =	instrutorService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
}
