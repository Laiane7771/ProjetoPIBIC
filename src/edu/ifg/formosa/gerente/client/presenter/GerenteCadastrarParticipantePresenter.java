package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerenteCadastrarParticipanteView;

public class GerenteCadastrarParticipantePresenter implements Presenter{

	private GerenteCadastrarParticipanteView gcpv;
	private final HandlerManager eventBus;
	
	public GerenteCadastrarParticipantePresenter(GerenteCadastrarParticipanteView gcpv,HandlerManager eventBus ){
		this.gcpv = gcpv;
		this.eventBus = eventBus;

	}



	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(gcpv.asWidget());
	}
}
