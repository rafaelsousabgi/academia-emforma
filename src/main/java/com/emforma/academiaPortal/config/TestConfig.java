package com.emforma.academiaPortal.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.entities.AvaliacaoFisica;
import com.emforma.academiaPortal.entities.enums.TipoFisico;
import com.emforma.academiaPortal.repositories.AlunoRepository;
import com.emforma.academiaPortal.repositories.AvaliacaoFisicaRepository;
import com.fasterxml.jackson.annotation.JsonFormat;


//classe para configuração  e popular o banco de dados injeção de dependencia
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

	SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void run(String... args) throws Exception {
		Aluno a2 = new Aluno(null,"ficar grande",TipoFisico.ECTOMORFO,"teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste");
		Aluno a3 = new Aluno(null,"ficar grande",TipoFisico.ENDOMORFO,"teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste");
		
		AvaliacaoFisica av1 = new AvaliacaoFisica(null, formato.parse("01/04/2023"), 56.8, 67.3, 78.8, 98.9, 105.7, 12.4, 78.9, 98.7, 34.6, 98.6, 58.9, 78.9, 89.7,98.6, a3);
		
		
		
		
		//a2.setId(null);
		//a2.setObjetivo("ficar grande");
		
		alunoRepository.saveAll(Arrays.asList(a2));
		alunoRepository.saveAll(Arrays.asList(a3));
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av1));
	}
	
	

}
