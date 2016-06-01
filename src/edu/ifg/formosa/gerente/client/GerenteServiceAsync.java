package edu.ifg.formosa.gerente.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Gerente;

public interface GerenteServiceAsync {

	public void adicionaCoordenador(Coordenador coordenador, AsyncCallback<Boolean> callback);
	public void buscarEventos(Evento nome, AsyncCallback<ArrayList<Evento>> callback);
	public void buscaNomeGerente(Gerente id, AsyncCallback<ArrayList<String>>callback);
	public void buscaCoordenadoresdeEvento(AsyncCallback<ArrayList<String>>callback);

}


