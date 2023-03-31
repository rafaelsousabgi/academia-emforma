package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instrutor extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cref;
	
	public Instrutor() {
		super();
	}
	
	public Instrutor(String nome, String sexo, String estadoCivil, String rg, String cpf, String email, String telefone,
			String cidade, String bairro, String uf, String cep, String profissao) {
		super(nome, sexo, estadoCivil, rg, cpf, email, telefone, cidade, bairro, uf, cep, profissao);
		// TODO Auto-generated constructor stub
	}



	public Instrutor(Long id, String cref) {
		super();
		this.id = id;
		this.cref = cref;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCref() {
		return cref;
	}
	public void setCref(String cref) {
		this.cref = cref;
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
		Instrutor other = (Instrutor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Instrutor [id=" + id + ", cref=" + cref + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getEstadoCivil()=" + getEstadoCivil() + ", getRg()=" + getRg() + ", getCpf()=" + getCpf()
				+ ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", getCidade()=" + getCidade()
				+ ", getBairro()=" + getBairro() + ", getUf()=" + getUf() + ", getCep()=" + getCep()
				+ ", getProfissao()=" + getProfissao() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
