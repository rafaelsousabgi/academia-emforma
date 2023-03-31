package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_aluno")
public class Aluno extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String objetivo;
	
		
	
	public Aluno(String nome, String sexo, String estadoCivil, String rg, String cpf, String email, String telefone,
			String cidade, String bairro, String uf, String cep, String profissao) {
		super(nome, sexo, estadoCivil, rg, cpf, email, telefone, cidade, bairro, uf, cep, profissao);
		
		
	}
	
	
	
	public Aluno(Long id, String objetivo) {
		super();
		this.id = id;
		this.objetivo = objetivo;
		//this.nome=nome;
		//this.sexo = sexo;
		//this.estadoCivil=estadoCivil;
		//this.rg =rg;
		
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
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", objetivo=" + objetivo + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getEstadoCivil()=" + getEstadoCivil() + ", getRg()=" + getRg() + ", getCpf()=" + getCpf()
				+ ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", getCidade()=" + getCidade()
				+ ", getBairro()=" + getBairro() + ", getUf()=" + getUf() + ", getCep()=" + getCep()
				+ ", getProfissao()=" + getProfissao() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}


	
	
	
}
