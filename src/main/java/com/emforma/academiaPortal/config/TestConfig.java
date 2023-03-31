package com.emforma.academiaPortal.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.repositories.AlunoRepository;


//classe para configuração  e popular o banco de dados injeção de dependencia
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public void run(String... args) throws Exception {
		Aluno a2 = new Aluno("teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste");
		a2.setId(null);
		a2.setObjetivo("ficar grande");
		
		alunoRepository.saveAll(Arrays.asList(a2));
		
	}
	
	

}
