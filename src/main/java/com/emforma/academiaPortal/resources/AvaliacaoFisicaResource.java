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

import com.emforma.academiaPortal.entities.AvaliacaoFisica;
import com.emforma.academiaPortal.services.AvaliacaoFisicaService;

@RestController
@RequestMapping(value = "/avaliacaofisicas")
public class AvaliacaoFisicaResource {
	
	@Autowired
	private AvaliacaoFisicaService avaliacaoFisicaService;

	//Metodo para Salvar um AvaliacaoFisica
	@GetMapping
	public ResponseEntity<List<AvaliacaoFisica>> findAll(){
		List<AvaliacaoFisica> list= avaliacaoFisicaService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um AvaliacaoFisica por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<AvaliacaoFisica> findById(@PathVariable Long id){
		AvaliacaoFisica obj = avaliacaoFisicaService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<AvaliacaoFisica> insert(@RequestBody AvaliacaoFisica obj){
	  obj =	avaliacaoFisicaService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
	
}
