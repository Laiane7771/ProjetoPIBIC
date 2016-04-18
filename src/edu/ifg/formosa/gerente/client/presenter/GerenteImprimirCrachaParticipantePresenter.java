package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerenteImprimirCrachaParticipanteView;

public class GerenteImprimirCrachaParticipantePresenter implements Presenter{

	private GerenteImprimirCrachaParticipanteView gicpv;
	private final HandlerManager eventBus;
	
	
	public GerenteImprimirCrachaParticipantePresenter(GerenteImprimirCrachaParticipanteView gicpv, HandlerManager eventBus ){
		this.gicpv = gicpv;
		this.eventBus = eventBus;
	}
	
	
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(gicpv.asWidget());
		
	}

}
