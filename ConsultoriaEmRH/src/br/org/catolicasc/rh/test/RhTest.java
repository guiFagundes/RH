package br.org.catolicasc.rh.test;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.org.catolicasc.rh.dao.CandidatoDao;
import br.org.catolicasc.rh.dao.CursoDao;
import br.org.catolicasc.rh.dao.EmpregoAnteriorDao;
import br.org.catolicasc.rh.entity.Candidato;
import br.org.catolicasc.rh.entity.Curso;
import br.org.catolicasc.rh.entity.EmpregoAnterior;
import br.org.catolicasc.rh.entity.Escolaridade;
import br.org.catolicasc.rh.entity.StatusCandidato;
import br.org.catolicasc.rh.entity.StatusCurso;
import br.org.catolicasc.rh.entity.TipoCurso;
import br.org.catolicasc.rh.persistence.JpaUtil;

@WebService
public class RhTest {

	public static void main(String[] args) {

		CandidatoDao candidatoDao = new CandidatoDao();

		JpaUtil.getEntityManager().getTransaction().begin();

		// Candidato 1
		Candidato candidato1 = new Candidato();
		candidato1.setNome("Carlos Drummond de Andrade");
		candidato1.setCódigo(7);
		candidato1.setEscolaridade(Escolaridade.GRADUACAO);
		candidato1.setIdade(50);
		candidato1.setSalárioPretendido(1500.0);
		candidato1.setStatus(StatusCandidato.DESEMPREGADO);
		// Empregos Candidato 1
		ArrayList<EmpregoAnterior> empregosAnteriores1 = new ArrayList<EmpregoAnterior>();
		EmpregoAnterior emprego1 = new EmpregoAnterior(1800.0, "Livraria LTDA", "Sao Paulo", "Escrever Poemas",
				"01/01/1970", "02/02/1978");
		EmpregoAnterior emprego2 = new EmpregoAnterior(1900.0, "Biblioteca LTDA", "Rio de Janeiro", "Criticar Poetas",
				"03/03/1978", "02/02/1979");
		empregosAnteriores1.add(emprego1);
		empregosAnteriores1.add(emprego2);
		// Persistindo empregos
		candidato1.setEmpregosAnteriores(empregosAnteriores1);

		// Candidato 2
		Candidato candidato2 = new Candidato();
		candidato2.setNome("Bruce Wayne");
		candidato2.setCódigo(2);
		candidato2.setEscolaridade(Escolaridade.ENSINO_FUNAMENTAL);
		candidato2.setIdade(37);
		candidato2.setSalárioPretendido(1340.0);
		candidato2.setStatus(StatusCandidato.EMPREGADO);
		// Empregos Candidato 2
		ArrayList<EmpregoAnterior> empregosAnteriores2 = new ArrayList<EmpregoAnterior>();
		EmpregoAnterior emprego3 = new EmpregoAnterior(1700.0, "Wayne Interprises", "Gotham", "Ser o Batman",
				"05/05/1990", "06/06/1996");
		empregosAnteriores2.add(emprego3);
		// Cursos Candidato 2
		ArrayList<Curso> cursos1 = new ArrayList<Curso>();
		Curso curso1 = new Curso(50, TipoCurso.GRADUACAO, "SENAI", "Gotham", StatusCurso.CONCLUIDO);
		cursos1.add(curso1);
		// Persistindo cursos e empregos
		candidato2.setCursos(cursos1);
		candidato2.setEmpregosAnteriores(empregosAnteriores2);

		Candidato candidato3 = new Candidato();
		candidato3.setNome("Clark Kent");
		candidato3.setCódigo(4);
		candidato3.setEscolaridade(Escolaridade.SEGUNDO_GRAU);
		candidato3.setIdade(28);
		candidato3.setSalárioPretendido(2000.0);
		candidato3.setStatus(StatusCandidato.EMPREGADO);
		// Cursos Candidato 3
		ArrayList<Curso> cursos2 = new ArrayList<Curso>();
		Curso curso2 = new Curso(60, TipoCurso.IDIOMA, "Metropolis University", "Smallville", StatusCurso.DESISTIU);
		cursos2.add(curso2);
		// Persistindo cursos
		candidato3.setCursos(cursos2);
		
		//Persistindo objetos
		candidatoDao.salva(candidato1);
		candidatoDao.salva(candidato2);
		candidatoDao.salva(candidato3);

		JpaUtil.getEntityManager().getTransaction().commit();
		
		Endpoint.publish("http://localhost:8888/livros", new RhTest());
		System.out.println("Servico inicializado!");
	}
	@WebResult(name = "candidato")
	public List<Candidato> listarCandidatos(String teste) {
		CandidatoDao candidatoDao = new CandidatoDao();
		return candidatoDao.listaTodos();
	}
	
	@WebResult(name = "candidato") 
	public Candidato buscarCandidatoPorId(@WebParam(name = "idCandidato") int idCandidato) {
		return new CandidatoDao().obterCandidatoID(idCandidato);
	}
}
