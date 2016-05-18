package edu.ifg.formosa.gerente.server;

import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ifg.formosa.gerente.client.GerenteService;
import edu.ifg.formosa.gerente.server.bd.CoordenadorDao;
import edu.ifg.formosa.gerente.server.bd.EventoDao;
import edu.ifg.formosa.gerente.server.bd.GerenteDao;
import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Gerente;


@SuppressWarnings("serial")
public class GerenteServiceImpl extends RemoteServiceServlet implements GerenteService{

	@Override
	public boolean adicionaCoordenador(Coordenador coordenador) {
		CoordenadorDao.inserir(coordenador);
		return true;
	}

	@Override
	public ArrayList<Evento> buscarEventos(Evento nome) {
		if(nome!=null){
		EventoDao eventoDao = new EventoDao();
			//return eventoDao.buscaEventoNome(nome);
		}
		else{
			//chama metodo buscar todos eventos;
		}
		return null;
	}

	@Override
	public ArrayList<String> buscaNomeGerente(Gerente id) {
		GerenteDao gerenteDao = new GerenteDao();
		try {
			return gerenteDao.buscaNomeGerente(id);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}


}
