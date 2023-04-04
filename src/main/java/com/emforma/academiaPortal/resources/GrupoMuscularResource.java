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

import com.emforma.academiaPortal.entities.GrupoMuscular;
import com.emforma.academiaPortal.services.GrupoMuscularService;

@RestController
@RequestMapping(value = "/gruposMusculares")
public class GrupoMuscularResource {
	
	@Autowired
	private GrupoMuscularService grupoMuscularService;

	//Metodo para Salvar um grupoMuscular
	@GetMapping
	public ResponseEntity<List<GrupoMuscular>> findAll(){
		List<GrupoMuscular> list= grupoMuscularService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um grupoMuscular por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<GrupoMuscular> findById(@PathVariable Long id){
		GrupoMuscular obj = grupoMuscularService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<GrupoMuscular> insert(@RequestBody GrupoMuscular obj){
	  obj =	grupoMuscularService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
	
}
