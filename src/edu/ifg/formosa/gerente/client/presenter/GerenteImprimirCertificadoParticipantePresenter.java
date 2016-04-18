package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerenteImprimirCertificadoParticipanteView;

public class GerenteImprimirCertificadoParticipantePresenter implements Presenter {

	private GerenteImprimirCertificadoParticipanteView gicpv;
	private final HandlerManager eventBus;
	
	public GerenteImprimirCertificadoParticipantePresenter(GerenteImprimirCertificadoParticipanteView gicpv, HandlerManager eventBus){
		this.gicpv = gicpv;
		this.eventBus = eventBus;
	}
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		// TODO Auto-generated method stub
		
	}

}
