package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.view.CoordenadorPesquisarMonitorView;

public class CoordenadorPesquisarMonitorPresenter implements Presenter{

	private CoordenadorPesquisarMonitorView PesquisarMonitor;
	private final HandlerManager eventBus;
	
	public CoordenadorPesquisarMonitorPresenter(CoordenadorPesquisarMonitorView PesquisarMonitor,
			HandlerManager eventBus){
		this.PesquisarMonitor = PesquisarMonitor;
		this.eventBus = eventBus;
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(null);
		containerTres.add(null);
		containerDois.add(PesquisarMonitor.asWidget());
	}
}
