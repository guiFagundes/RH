package br.org.catolicasc.rh.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum()
@XmlType(name="statusCurso")
public enum StatusCurso {
	
	@XmlEnumValue("cursando")
	CURSANDO, 
	@XmlEnumValue("concluido")
	CONCLUIDO,
	@XmlEnumValue("desistiu")
	DESISTIU

}
