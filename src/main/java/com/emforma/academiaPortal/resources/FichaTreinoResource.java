package com.emforma.academiaPortal.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emforma.academiaPortal.entities.AvaliacaoFisica;
import com.emforma.academiaPortal.entities.FichaTreino;
import com.emforma.academiaPortal.services.AvaliacaoFisicaService;
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
	
}
