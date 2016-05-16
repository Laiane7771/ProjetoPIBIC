package edu.ifg.formosa.gerente.server;

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ifg.formosa.gerente.client.GerenteService;
import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Participante;

@SuppressWarnings("serial")
public class GerenteServiceImpl extends RemoteServiceServlet implements GerenteService{

	@Override
	public ArrayList<Evento> buscaEventosPorNome(String nome) {
				return null;
	}

	@Override
	public ArrayList<Coordenador> buscaCoordenadorPorNome(String nome) {
		
		ArrayList<Coordenador> lista = new ArrayList<Coordenador>();
		Coordenador coordenador = new Coordenador();
		coordenador.getUsuario().setNome("Laiane");
		coordenador.setMatriculaSiape("20141070130020");
		return lista;
	}

	@Override
	public ArrayList<Coordenador> buscaCrachaCoordenador(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Coordenador> buscaCertificadoCoordenador(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Participante> buscaCertificadoParticipante(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Participante> buscaCrachaParticipante(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Participante> adicionaParticipante(Participante participante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Evento> adicionaEvento(Evento evento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Coordenador> adicionaCoordenador(Coordenador coordenador) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
