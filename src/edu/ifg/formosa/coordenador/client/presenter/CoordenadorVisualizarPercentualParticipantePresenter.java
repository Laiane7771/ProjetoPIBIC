package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.view.CoordenadorVisualizarPercentualParticipanteView;

public class CoordenadorVisualizarPercentualParticipantePresenter implements Presenter {

	private CoordenadorVisualizarPercentualParticipanteView VisualizarPercentual;
	private final HandlerManager eventBus;
	
	public CoordenadorVisualizarPercentualParticipantePresenter
	(CoordenadorVisualizarPercentualParticipanteView VisualizarPercentual, HandlerManager eventBus){
		this.VisualizarPercentual = VisualizarPercentual;
		this.eventBus = eventBus;
	}
	public void bind(){
		
	}
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(VisualizarPercentual.asWidget());
		
	}
}
