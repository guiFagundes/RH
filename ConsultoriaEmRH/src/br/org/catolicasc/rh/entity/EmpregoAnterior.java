package br.org.catolicasc.rh.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class EmpregoAnterior implements Bean {

	@Id
	@GeneratedValue
	private Long id;
	private Double remunera��o;
	private String empresa;
	private String cidade;
	private String atividadesDesempenhadas;
	private String dataAdmissao;
	private String dataDemiss�o;
	
	public EmpregoAnterior() {
		super();
	}
	public EmpregoAnterior(Double remunera��o, String empresa, String cidade, String atividadesDesempenhadas,
			String dataAdmissao, String dataDemiss�o) {
		super();
		this.remunera��o = remunera��o;
		this.empresa = empresa;
		this.cidade = cidade;
		this.atividadesDesempenhadas = atividadesDesempenhadas;
		this.dataAdmissao = dataAdmissao;
		this.dataDemiss�o = dataDemiss�o;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getRemunera��o() {
		return remunera��o;
	}
	public void setRemunera��o(Double remunera��o) {
		this.remunera��o = remunera��o;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getAtividadesDesempenhadas() {
		return atividadesDesempenhadas;
	}
	public void setAtividadesDesempenhadas(String atividadesDesempenhadas) {
		this.atividadesDesempenhadas = atividadesDesempenhadas;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getDataDemiss�o() {
		return dataDemiss�o;
	}
	public void setDataDemiss�o(String dataDemiss�o) {
		this.dataDemiss�o = dataDemiss�o;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atividadesDesempenhadas == null) ? 0 : atividadesDesempenhadas.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dataAdmissao == null) ? 0 : dataAdmissao.hashCode());
		result = prime * result + ((dataDemiss�o == null) ? 0 : dataDemiss�o.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((remunera��o == null) ? 0 : remunera��o.hashCode());
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
		EmpregoAnterior other = (EmpregoAnterior) obj;
		if (atividadesDesempenhadas == null) {
			if (other.atividadesDesempenhadas != null)
				return false;
		} else if (!atividadesDesempenhadas.equals(other.atividadesDesempenhadas))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (dataAdmissao == null) {
			if (other.dataAdmissao != null)
				return false;
		} else if (!dataAdmissao.equals(other.dataAdmissao))
			return false;
		if (dataDemiss�o == null) {
			if (other.dataDemiss�o != null)
				return false;
		} else if (!dataDemiss�o.equals(other.dataDemiss�o))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (remunera��o == null) {
			if (other.remunera��o != null)
				return false;
		} else if (!remunera��o.equals(other.remunera��o))
			return false;
		return true;
	}
	
	
	
}
