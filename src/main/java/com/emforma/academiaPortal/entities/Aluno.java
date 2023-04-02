package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.emforma.academiaPortal.entities.enums.TipoFisico;
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
	
	private Integer tipofisico;	
	
	public Aluno() {
		
	}

	public Aluno(Long id, String objetivo,TipoFisico tipofisico,String nome, String sexo, String estadoCivil, String rg, String cpf, String email, String telefone,
			String cidade, String bairro, String uf, String cep, String profissao) {
		super(nome, sexo, estadoCivil, rg, cpf, email, telefone, cidade, bairro, uf, cep, profissao);
		this.id = id;
		this.objetivo = objetivo;
		setTipofisico(tipofisico);
		
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
	
	public TipoFisico getTipofisico() {
		return TipoFisico.valueOf(tipofisico);
	}

	public void setTipofisico(TipoFisico tipofisico) {
		if(tipofisico !=null) {
		this.tipofisico = tipofisico.getCode();
		}
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
