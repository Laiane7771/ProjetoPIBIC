package edu.ifg.formosa.gerente.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Participante;


public interface GerenteServiceAsync {

	public void buscaEventosPorNome(String nome, AsyncCallback<ArrayList<Evento>> callback);
	public void buscaCoordenadorPorNome(String nome, AsyncCallback<ArrayList<Coordenador>> callback);
	public void buscaCrachaCoordenador(String nome, AsyncCallback<ArrayList<Coordenador>> callback);
	public void buscaCertificadoCoordenador(String nome, AsyncCallback<ArrayList<Coordenador>> callback);
	public void buscaCertificadoParticipante(String nome, AsyncCallback<ArrayList<Participante>> callback);
	public void buscaCrachaParticipante(String nome, AsyncCallback<ArrayList<Participante>> callback);
	public void adicionaParticipante(Participante participante, AsyncCallback<ArrayList<Participante>> callback);
	public void adicionaEvento(Evento evento, AsyncCallback<ArrayList<Evento>> callback);
	public void adicionaCoordenador(Coordenador coordenador, AsyncCallback<ArrayList<Coordenador>>callback);




}

