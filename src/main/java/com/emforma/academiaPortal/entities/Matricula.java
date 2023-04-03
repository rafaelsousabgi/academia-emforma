package com.emforma.academiaPortal.entities;

import java.util.Date;
import java.util.Objects;

public class Matricula {
	
	private Long id;
	private Date dataMatricula;
	private Double valorMensalidade;
	
	private Aluno aluno;

	public Matricula() {
		super();
	}

	public Matricula(Long id, Date dataMatricula, Double valorMensalidade, Aluno aluno) {
		super();
		this.id = id;
		this.dataMatricula = dataMatricula;
		this.valorMensalidade = valorMensalidade;
		this.aluno = aluno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
		Matricula other = (Matricula) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
