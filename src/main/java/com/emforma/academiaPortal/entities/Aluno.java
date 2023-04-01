package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_aluno")
public class Aluno extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String objetivo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "aluno")
	private List<AvaliacaoFisica> avaliacao = new ArrayList<>();
	
		
	
	public Aluno() {
		
	}

	public Aluno(Long id, String objetivo,String nome, String sexo, String estadoCivil, String rg, String cpf, String email, String telefone,
			String cidade, String bairro, String uf, String cep, String profissao) {
		super(nome, sexo, estadoCivil, rg, cpf, email, telefone, cidade, bairro, uf, cep, profissao);
		this.id = id;
		this.objetivo = objetivo;
		
	}
	
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public List<AvaliacaoFisica> getAvaliacao() {
		return avaliacao;
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
		Aluno other = (Aluno) obj;
		return Objects.equals(id, other.id);
	}

	


	
	
	
}
