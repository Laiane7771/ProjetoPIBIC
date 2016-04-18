package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.view.CoordenadorCadastrarMonitorView;

public class CoordenadorCadastrarMonitorPresenter implements Presenter{

	private CoordenadorCadastrarMonitorView cadastrarMonitor;
	private final HandlerManager eventBus;
	
	public CoordenadorCadastrarMonitorPresenter(CoordenadorCadastrarMonitorView cadastrarMonitor, 
			HandlerManager eventBus){
		this.cadastrarMonitor = cadastrarMonitor;
		this.eventBus = eventBus;
		
	}
	
	public void bind(){
		
	}
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		// TODO Auto-generated method stub
		
	}

}
