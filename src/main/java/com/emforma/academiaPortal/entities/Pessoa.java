package com.emforma.academiaPortal.entities;

import java.sql.Date;

 public abstract class Pessoa {

	private String nome;
	private String sexo;
	private String estadoCivil;
	private String rg;
	private String cpf;
	private String email;
	private String telefone;
	private String cidade;
	private String bairro;
	private String uf;
	private String cep;
	private String profissao;
	//private Date dataNascimento;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sexo, String estadoCivil, String rg, String cpf, String email, String telefone,
			String cidade, String bairro, String uf, String cep, String profissao) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
		this.cep = cep;
		this.profissao = profissao;
		//this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
	


	
	
	
}
