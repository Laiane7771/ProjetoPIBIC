package edu.ifg.formosa.principal.client;



import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ifg.formosa.principal.shared.Evento;
import edu.ifg.formosa.principal.shared.Gerente;

@RemoteServiceRelativePath("principalservice")
public interface PrincipalService extends RemoteService {
	
  ArrayList<Evento> buscarEventos(Evento nome);
  int buscaIdEventoSessao();
  boolean setaIdEventoSessao(int idEvento);
  Gerente buscaLogin();
}
