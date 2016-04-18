package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerentePesquisarParticipanteView;

public class GerentePesquisarParticipantePresenter implements Presenter{
	
	private GerentePesquisarParticipanteView tigp;
	private final HandlerManager eventBus;
	
	
	public GerentePesquisarParticipantePresenter(GerentePesquisarParticipanteView tigp, HandlerManager eventBus){
		this.tigp = tigp;
		this.eventBus = eventBus;
	}
	
	public void bind(){
		
	}



	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		
		containerDois.add(tigp.asWidget());
		bind();
		
	}

}
