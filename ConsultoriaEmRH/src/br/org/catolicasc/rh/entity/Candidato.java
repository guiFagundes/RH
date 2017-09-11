package br.org.catolicasc.rh.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Candidato implements Bean {

	@Id @GeneratedValue
	private Long id;
	private Integer código;
	private String nome;
	private Escolaridade escolaridade;
	private Integer idade;
	private Double salárioPretendido;
	private StatusCandidato statusCandidato;

	//Fazer sei la oq com JPQL
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Curso> cursos;

	@OneToMany(cascade = CascadeType.ALL)
	private List<EmpregoAnterior> empregosAnteriores;
	
	public StatusCandidato getStatusCandidato() {
		return statusCandidato;
	}

	public void setStatusCandidato(StatusCandidato statusCandidato) {
		this.statusCandidato = statusCandidato;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<EmpregoAnterior> getEmpregosAnteriores() {
		return empregosAnteriores;
	}

	public void setEmpregosAnteriores(ArrayList<EmpregoAnterior> empregosAnteriores) {
		this.empregosAnteriores = empregosAnteriores;
	}

	public void setCódigo(Integer código) {
		this.código = código;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalárioPretendido() {
		return salárioPretendido;
	}

	public void setSalárioPretendido(Double salárioPretendido) {
		this.salárioPretendido = salárioPretendido;
	}

	public StatusCandidato getStatus() {
		return statusCandidato;
	}

	public void setStatus(StatusCandidato statusCandidato) {
		this.statusCandidato = statusCandidato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result + ((código == null) ? 0 : código.hashCode());
		result = prime * result + ((empregosAnteriores == null) ? 0 : empregosAnteriores.hashCode());
		result = prime * result + ((escolaridade == null) ? 0 : escolaridade.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((salárioPretendido == null) ? 0 : salárioPretendido.hashCode());
		result = prime * result + ((statusCandidato == null) ? 0 : statusCandidato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (código == null) {
			if (other.código != null)
				return false;
		} else if (!código.equals(other.código))
			return false;
		if (empregosAnteriores == null) {
			if (other.empregosAnteriores != null)
				return false;
		} else if (!empregosAnteriores.equals(other.empregosAnteriores))
			return false;
		if (escolaridade != other.escolaridade)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (salárioPretendido == null) {
			if (other.salárioPretendido != null)
				return false;
		} else if (!salárioPretendido.equals(other.salárioPretendido))
			return false;
		if (statusCandidato != other.statusCandidato)
			return false;
		return true;
	}

	

}
