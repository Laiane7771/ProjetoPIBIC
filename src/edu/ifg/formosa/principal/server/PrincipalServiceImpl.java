package edu.ifg.formosa.principal.server;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ifg.formosa.principal.client.PrincipalService;
import edu.ifg.formosa.principal.server.bd.EventoDAO;
import edu.ifg.formosa.principal.shared.Evento;

@SuppressWarnings("serial")
public class PrincipalServiceImpl extends RemoteServiceServlet implements
PrincipalService {

	@Override
	public ArrayList<Evento> buscarEventos(Evento nome) {
		if(nome!=null){
		EventoDAO eventoDao = new EventoDAO();
		return eventoDao.buscaEventoNome(nome);
		}
		else{
			//chama metodo buscar todos eventos;
		}
		return null;
	}

	@Override
	public int buscaIdEventoSessao() {
		int idEvento = 0;
		HttpSession session = this.getThreadLocalRequest().getSession();
		Object o = session.getAttribute("idEvento");
		if(o!=null){
			idEvento = (int)o;
		}
		return idEvento;
	}
	
	@Override
	public boolean setaIdEventoSessao(int idEvento) {
		this.getThreadLocalRequest().getSession().setAttribute("idEvento", idEvento);
		return true;
	}
	
	
	
}
