package edu.ifg.formosa.principal.server;

import edu.ifg.formosa.principal.server.bd.EventoDAO;
import edu.ifg.formosa.principal.shared.Evento;

public class Main_Teste {

	public static void main(String[] args) {
		Evento evento = new Evento();
		
		EventoDAO eventoDao = new EventoDAO();
		evento.setNomeEvento("E");
		System.out.println(eventoDao.buscaEventoNome(evento).size());

	}

}
