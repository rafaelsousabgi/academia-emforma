package com.emforma.academiaPortal.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.entities.Pessoa;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

	@GetMapping
	public ResponseEntity<Aluno> findAll(){
		
		Aluno a2 = new Aluno("teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste");
		a2.setId(1L);
		a2.setObjetivo("ficar grande");
		
	   System.out.println(a2);
	
		return ResponseEntity.ok().body(a2);
		
	}
}
