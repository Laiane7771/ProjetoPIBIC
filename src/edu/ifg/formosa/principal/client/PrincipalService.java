package edu.ifg.formosa.principal.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ifg.formosa.principal.shared.Evento;

@RemoteServiceRelativePath("principalservice")
public interface PrincipalService extends RemoteService {
	
  ArrayList<Evento> buscarEventos(String nome);
}
