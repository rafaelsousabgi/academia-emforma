package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.Objects;

public class Aluno extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String objetivo;
	
	Pessoa aluno = new Aluno();
	
	
	

	
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
	public Aluno() {
		super();
	}
	public Aluno(Long id, String objetivo) {
		super();
		this.id = id;
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
	
	
	
}
