package com.emforma.academiaPortal.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.entities.AvaliacaoFisica;
import com.emforma.academiaPortal.entities.Instrutor;
import com.emforma.academiaPortal.entities.enums.TipoFisico;
import com.emforma.academiaPortal.repositories.AlunoRepository;
import com.emforma.academiaPortal.repositories.AvaliacaoFisicaRepository;
import com.emforma.academiaPortal.repositories.InstrutorRepository;
import com.fasterxml.jackson.annotation.JsonFormat;


//classe para configuração  e popular o banco de dados injeção de dependencia
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	private InstrutorRepository instrutorRepository;

	SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void run(String... args) throws Exception {
		Aluno a2 = new Aluno(null,"ficar grande",TipoFisico.ECTOMORFO,"teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste");
		Aluno a3 = new Aluno(null,"ficar grande",TipoFisico.ENDOMORFO,"teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste","teste");
		
		
		
		Instrutor ins1 = new Instrutor(null,"23456b", "Andre","Solteiro","teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2");		
		Instrutor ins2 = new Instrutor(null,"23456b", "Rafael","Solteiro","teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2", "teste2");
		
		AvaliacaoFisica av1 = new AvaliacaoFisica(null, formato.parse("01/04/2023"), 56.8, 67.3, 78.8, 98.9, 105.7, 12.4, 78.9, 98.7, 34.6, 98.6, 58.9, 78.9, 89.7,98.6, a3, ins2);
		AvaliacaoFisica av2 = new AvaliacaoFisica(null, formato.parse("02/04/2023"), 56.8, 67.3, 78.8, 98.9, 105.7, 12.4, 78.9, 98.7, 34.6, 98.6, 58.9, 78.9, 89.7,98.6, a2, ins1);
		AvaliacaoFisica av3 = new AvaliacaoFisica(null, formato.parse("02/04/2023"), 56.8, 67.3, 78.8, 98.9, 105.7, 12.4, 78.9, 98.7, 34.6, 98.6, 58.9, 78.9, 89.7,98.6, a2, ins2);
		//a2.setId(null);
		//a2.setObjetivo("ficar grande");
		
		alunoRepository.saveAll(Arrays.asList(a2));
		alunoRepository.saveAll(Arrays.asList(a3));
		
		instrutorRepository.saveAll(Arrays.asList(ins1));
		instrutorRepository.saveAll(Arrays.asList(ins2));
		
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av1));
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av2));
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av3));
	}
	
	

}
