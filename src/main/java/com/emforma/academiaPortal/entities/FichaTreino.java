package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_FICHATREINO")
public class FichaTreino implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	
	@ManyToMany
	@JoinTable(name = "TB_TREINO_EXERCICIOS",
	joinColumns = @JoinColumn(name="FICHATREINO_ID"),
	inverseJoinColumns = @JoinColumn(name="EXERCICIO_ID"))
	private Set<Exercicio> exercicios = new HashSet<>();
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="Avaliacao_id")
	private AvaliacaoFisica avaliacao;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="Aluno_id")
	private Aluno aluno;
	
	public FichaTreino() {
		
	}
	
	

	public FichaTreino(Long id, String nome, String descricao,AvaliacaoFisica avaliacao,Aluno aluno) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.avaliacao = avaliacao;
		this.aluno = aluno;
	}

	


	public Aluno getAluno() {
		return aluno;
	}



	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}



	public AvaliacaoFisica getAvaliacao() {
		return avaliacao;
	}



	public void setAvaliacao(AvaliacaoFisica avaliacao) {
		this.avaliacao = avaliacao;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Exercicio> getExercicios() {
		return exercicios;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaTreino other = (FichaTreino) obj;
		return Objects.equals(id, other.id);
	}





	
	
	
	
	

}
