package com.emforma.academiaPortal.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emforma.academiaPortal.entities.GrupoMuscular;
import com.emforma.academiaPortal.services.GrupoMuscularService;

@RestController
@RequestMapping(value = "/grupoMusculars")
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
	
}
