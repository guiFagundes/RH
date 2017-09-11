package br.org.catolicasc.rh.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum()
@XmlType(name="statusCandidato")
public enum StatusCandidato {
	
	@XmlEnumValue("empregado")
	EMPREGADO, 
	@XmlEnumValue("desempregado")
	DESEMPREGADO

}
