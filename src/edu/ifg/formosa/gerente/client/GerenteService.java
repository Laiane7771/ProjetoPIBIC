package edu.ifg.formosa.gerente.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Participante;


@RemoteServiceRelativePath("gerenteservice")
public interface GerenteService extends RemoteService{
	
	ArrayList<Evento> buscaEventosPorNome(String nome);
	ArrayList<Coordenador> buscaCoordenadorPorNome(String nome);
	ArrayList<Coordenador> buscaCrachaCoordenador(String nome);
	ArrayList<Coordenador> buscaCertificadoCoordenador(String nome);
	ArrayList<Participante> buscaCertificadoParticipante(String nome);
	ArrayList<Participante> buscaCrachaParticipante(String nome);
	ArrayList<Participante> adicionaParticipante(Participante participante);
	ArrayList<Evento> adicionaEvento(Evento evento);
	ArrayList<Coordenador> adicionaCoordenador(Coordenador coordenador);

}
