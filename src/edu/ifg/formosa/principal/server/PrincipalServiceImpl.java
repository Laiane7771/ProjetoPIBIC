package edu.ifg.formosa.principal.server;

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ifg.formosa.principal.client.PrincipalService;
import edu.ifg.formosa.principal.server.bd.EventoDAO;
import edu.ifg.formosa.principal.shared.Evento;

@SuppressWarnings("serial")
public class PrincipalServiceImpl extends RemoteServiceServlet implements
    PrincipalService {

	@Override
	public ArrayList<Evento> buscarEventos(String nome) {
		//EventoDAO
		return null;
	}



 
}
