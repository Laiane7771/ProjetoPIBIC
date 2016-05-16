package edu.ifg.formosa.principal.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ifg.formosa.principal.shared.Evento;

public interface PrincipalServiceAsync {

  public void buscarEventos(Evento nome, AsyncCallback<ArrayList<Evento>> callback);
  public void buscaIdEventoSessao(AsyncCallback<Integer> callback);
  public void setaIdEventoSessao(int idEvento, AsyncCallback<Boolean> callback);
}

