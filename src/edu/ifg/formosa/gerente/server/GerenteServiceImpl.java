package edu.ifg.formosa.gerente.server;



import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ifg.formosa.gerente.client.GerenteService;
import edu.ifg.formosa.gerente.server.bd.CoordenadorDao;
import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Gerente;


@SuppressWarnings("serial")
public class GerenteServiceImpl extends RemoteServiceServlet implements GerenteService{

	@Override
	public boolean adicionaCoordenador(Coordenador coordenador) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Evento> buscarEventos(Evento nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> buscaNomeGerente(Gerente id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> buscaCoordenadoresdeEvento() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
