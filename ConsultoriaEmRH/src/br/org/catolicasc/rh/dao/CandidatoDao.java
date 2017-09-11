package br.org.catolicasc.rh.dao;

import br.org.catolicasc.rh.entity.Candidato;

public class CandidatoDao extends JpaDaoBase<Candidato> {

	public Candidato obterCandidatoID(int id) {
		Candidato retorno = null;
		for (Candidato candidato : new CandidatoDao().listaTodos()) {
			if (candidato.getId() == id) {
				retorno = candidato;
			}
		}
		return retorno;
	}
	
}
