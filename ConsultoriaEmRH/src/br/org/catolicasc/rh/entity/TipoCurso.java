package br.org.catolicasc.rh.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum()
@XmlType(name="tipoCurso")
public enum TipoCurso {

		@XmlEnumValue("profissionalizante")
		PROFISSIONALIZANTEL, 
		@XmlEnumValue("técnico")
		TECNICO, 
		@XmlEnumValue("superior")
		SUPERIOR,
		@XmlEnumValue("pos")
		POS,
		@XmlEnumValue("graduacao")
		GRADUACAO,
		@XmlEnumValue("idioma")
		IDIOMA
}

