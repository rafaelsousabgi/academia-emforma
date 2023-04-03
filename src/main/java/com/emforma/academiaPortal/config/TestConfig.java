package com.emforma.academiaPortal.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.emforma.academiaPortal.entities.Aluno;
import com.emforma.academiaPortal.entities.AvaliacaoFisica;
import com.emforma.academiaPortal.entities.Exercicio;
import com.emforma.academiaPortal.entities.FichaTreino;
import com.emforma.academiaPortal.entities.Instrutor;
import com.emforma.academiaPortal.entities.enums.TipoFisico;
import com.emforma.academiaPortal.repositories.AlunoRepository;
import com.emforma.academiaPortal.repositories.AvaliacaoFisicaRepository;
import com.emforma.academiaPortal.repositories.ExercicioRepository;
import com.emforma.academiaPortal.repositories.FichaTreinoRepository;
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
	
	@Autowired
	private FichaTreinoRepository fichaTreinoRepository;
	
	@Autowired
	private ExercicioRepository exercicioRepository;

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
		
		FichaTreino ficha1 = new FichaTreino(null, "Treino c", "foco biceps,triceps,antebraços");
		FichaTreino ficha2 = new FichaTreino(null, "Treino B", "Foco Peito, costas,ombro");
		FichaTreino ficha3 = new FichaTreino(null, "Treino A", "foco inferior");
		
		fichaTreinoRepository.saveAll(Arrays.asList(ficha1,ficha2,ficha3));
		
		Exercicio exe1 = new Exercicio(null, "Legue press",15 , 3);
		Exercicio exe2 = new Exercicio(null, "Agachamento Livre",15 , 3);
		Exercicio exe3 = new Exercicio(null, "extensora",15 , 10);
		
		
		Exercicio exe4 = new Exercicio(null, "Supino",15 , 3);
		Exercicio exe5 = new Exercicio(null, "Supino inclinado halteres",15 , 3);
		Exercicio exe6 = new Exercicio(null, "Peck deck fly",15 , 3);
		
		Exercicio exe7 = new Exercicio(null, "Barra fixa ou graviton",15 , 3);
		Exercicio exe8 = new Exercicio(null, "Remada baixa no triângulo",15 , 3);
		Exercicio exe9 = new Exercicio(null, "Puxada alta",15 , 3);
		
		exercicioRepository.saveAll(Arrays.asList(exe1,exe2,exe3,exe4,exe5,exe6,exe7,exe8,exe9));
		
		
		ficha3.getExercicios().add(exe3);
		ficha3.getExercicios().add(exe2);
		ficha3.getExercicios().add(exe3);
		
		ficha2.getExercicios().add(exe4);
		ficha2.getExercicios().add(exe5);
		ficha2.getExercicios().add(exe6);
		
		ficha1.getExercicios().add(exe7);
		ficha1.getExercicios().add(exe8);
		ficha1.getExercicios().add(exe9);
		ficha1.getExercicios().add(exe5);
		ficha1.getExercicios().add(exe3);
		
		fichaTreinoRepository.saveAll(Arrays.asList(ficha1,ficha2,ficha3));
		
		
		
		
		alunoRepository.saveAll(Arrays.asList(a2));
		alunoRepository.saveAll(Arrays.asList(a3));
		
		instrutorRepository.saveAll(Arrays.asList(ins1));
		instrutorRepository.saveAll(Arrays.asList(ins2));
		
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av1));
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av2));
		avaliacaoFisicaRepository.saveAll(Arrays.asList(av3));
	}
	
	

}
