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

import com.emforma.academiaPortal.entities.FichaTreino;
import com.emforma.academiaPortal.services.FichaTreinoService;

@RestController
@RequestMapping(value = "/fichatreinos")
public class FichaTreinoResource {
	
	@Autowired
	private FichaTreinoService fichaTreinoService;

	//Metodo para Salvar um AvaliacaoFisica
	@GetMapping
	public ResponseEntity<List<FichaTreino>> findAll(){
		List<FichaTreino> list= fichaTreinoService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um AvaliacaoFisica por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<FichaTreino> findById(@PathVariable Long id){
		FichaTreino obj = fichaTreinoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<FichaTreino> insert(@RequestBody FichaTreino obj){
	  obj =	fichaTreinoService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
}
