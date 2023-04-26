package com.emforma.academiaPortal.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.services.AlunoService;

@Controller
@RequestMapping("/alunos")
public class AlunoResource {
	
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping("/cadastrar")
	public String Cadastrar() {
		return "/aluno/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/aluno/lista";
	}

	//Metodo para buscar um aluno no banco
	@GetMapping()
	public ResponseEntity<List<Aluno>> findAll(){
		List<Aluno> list= alunoService.findAll();	
		return ResponseEntity.ok().body(list);		
	}
	
	//metodo para buscar um aluno por id
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> findById(@PathVariable Long id){
		Aluno obj = alunoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//inserir um objeto do tipo aluno no banco
	
	@PostMapping("/salvar")
	public ResponseEntity<Aluno> insert(@RequestBody Aluno obj){
	  obj =	alunoService.insert(obj);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			  .buildAndExpand(obj.getId()).toUri();
	  return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		
		   alunoService.delete(id);
		   return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Aluno> update(@PathVariable Long id, @RequestBody Aluno obj){
		   
		   obj= alunoService.update(id, obj);
		   return ResponseEntity.ok().body(obj);
	}
}
