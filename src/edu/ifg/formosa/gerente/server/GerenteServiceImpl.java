package edu.ifg.formosa.gerente.server;



import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ifg.formosa.gerente.client.GerenteService;
import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Gerente;


@SuppressWarnings("serial")
public class GerenteServiceImpl extends RemoteServiceServlet implements GerenteService{

	@Override
	public boolean adicionaCoordenador(Coordenador coordenador) {
		
		return false;
	}

	@Override
	public ArrayList<Evento> buscarEventos(Evento nome) {
		
		return null;
	}

	@Override
	public ArrayList<String> buscaNomeGerente(Gerente id) {
	 return null;
	}

	@Override
	public ArrayList<Coordenador> buscaCoordenadoresdeEventoPorNome(Coordenador coordenador) {
		
		return null;
	}



}
