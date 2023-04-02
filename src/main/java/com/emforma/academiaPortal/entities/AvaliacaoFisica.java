package com.emforma.academiaPortal.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_AVALIACAOFISICA")
public class AvaliacaoFisica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private Date dataAvaliacao;
	private Double peso;
	private Double altura;
	private Double peito;
	private Double cintura;
	private Double panturrilhaDireita;
	private Double panturrilhaEsquerda;
	private Double coxaDireita;
	private Double coxaEsqueda;
	private Double bracoEsquedo;
	private Double bracoDireito;
	private Double antebracoEsquedo;
	private Double antebracoDireito;
	private Double gluteo;
	private Double imc;
	
	@ManyToOne
	@JoinColumn(name ="aluno_id")
	private Aluno aluno;

	
	@ManyToOne
	@JoinColumn(name="instrutor_id")
	private Instrutor instrutor;
	

	public AvaliacaoFisica() {
		super();
	}



	public AvaliacaoFisica(Long id,Date dataAvaliacao, Double peso, Double altura, Double peito, Double cintura,
			Double panturrilhaDireita, Double panturrilhaEsquerda, Double coxaDireita, Double coxaEsqueda,
			Double bracoEsquedo, Double bracoDireito, Double antebracoEsquedo, Double antebracoDireito, Double gluteo,
			Double imc, Aluno aluno, Instrutor instrutor) {
		super();
		this.id = id;
		this.dataAvaliacao = dataAvaliacao;
		this.peso = peso;
		this.altura = altura;
		this.peito = peito;
		this.cintura = cintura;
		this.panturrilhaDireita = panturrilhaDireita;
		this.panturrilhaEsquerda = panturrilhaEsquerda;
		this.coxaDireita = coxaDireita;
		this.coxaEsqueda = coxaEsqueda;
		this.bracoEsquedo = bracoEsquedo;
		this.bracoDireito = bracoDireito;
		this.antebracoEsquedo = antebracoEsquedo;
		this.antebracoDireito = antebracoDireito;
		this.gluteo = gluteo;
		this.imc = imc;
		this.aluno = aluno;
		this.instrutor= instrutor;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeito() {
		return peito;
	}

	public void setPeito(Double peito) {
		this.peito = peito;
	}

	public Double getCintura() {
		return cintura;
	}

	public void setCintura(Double cintura) {
		this.cintura = cintura;
	}

	public Double getPanturrilhaDireita() {
		return panturrilhaDireita;
	}

	public void setPanturrilhaDireita(Double panturrilhaDireita) {
		this.panturrilhaDireita = panturrilhaDireita;
	}

	public Double getPanturrilhaEsquerda() {
		return panturrilhaEsquerda;
	}

	public void setPanturrilhaEsquerda(Double panturrilhaEsquerda) {
		this.panturrilhaEsquerda = panturrilhaEsquerda;
	}

	public Double getCoxaDireita() {
		return coxaDireita;
	}

	public void setCoxaDireita(Double coxaDireita) {
		this.coxaDireita = coxaDireita;
	}

	public Double getCoxaEsqueda() {
		return coxaEsqueda;
	}

	public void setCoxaEsqueda(Double coxaEsqueda) {
		this.coxaEsqueda = coxaEsqueda;
	}

	public Double getBracoEsquedo() {
		return bracoEsquedo;
	}

	public void setBracoEsquedo(Double bracoEsquedo) {
		this.bracoEsquedo = bracoEsquedo;
	}

	public Double getBracoDireito() {
		return bracoDireito;
	}

	public void setBracoDireito(Double bracoDireito) {
		this.bracoDireito = bracoDireito;
	}

	public Double getAntebracoEsquedo() {
		return antebracoEsquedo;
	}

	public void setAntebracoEsquedo(Double antebracoEsquedo) {
		this.antebracoEsquedo = antebracoEsquedo;
	}

	public Double getAntebracoDireito() {
		return antebracoDireito;
	}

	public void setAntebracoDireito(Double antebracoDireito) {
		this.antebracoDireito = antebracoDireito;
	}

	public Double getGluteo() {
		return gluteo;
	}

	public void setGluteo(Double gluteo) {
		this.gluteo = gluteo;
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	

	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}



	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	
	
	

	public Instrutor getInstrutor() {
		return instrutor;
	}



	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
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
		AvaliacaoFisica other = (AvaliacaoFisica) obj;
		return Objects.equals(id, other.id);
	}





	

}
