package edu.ifg.formosa.gerente.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Gerente;



@RemoteServiceRelativePath("gerenteservice")
public interface GerenteService extends RemoteService{
	
	public boolean adicionaCoordenador(Coordenador coordenador);
	public ArrayList<Evento> buscarEventos(Evento nome);
	public ArrayList<String> buscaNomeGerente(Gerente id);

}
