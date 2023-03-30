package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.Objects;

public class Instrutor extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String cref;
	public Instrutor() {
		super();
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
	
	

}
