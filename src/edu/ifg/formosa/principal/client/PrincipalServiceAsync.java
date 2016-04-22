package edu.ifg.formosa.principal.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ifg.formosa.principal.shared.Evento;

public interface PrincipalServiceAsync {

  public void buscarEventos(String nome, AsyncCallback<ArrayList<Evento>> callback);

}

