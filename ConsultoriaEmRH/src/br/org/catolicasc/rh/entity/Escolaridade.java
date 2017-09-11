package br.org.catolicasc.rh.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum()
@XmlType(name="escolaridade")
public enum Escolaridade {

	@XmlEnumValue("ensinoFundamental")
	ENSINO_FUNAMENTAL, 
	@XmlEnumValue("segundoGrau")
	SEGUNDO_GRAU, 
	@XmlEnumValue("graduacao")
	GRADUACAO
}
