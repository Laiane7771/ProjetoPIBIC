package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.view.PainelEscolhaModuloView;

public class PainelEscolhaModuloPresenter implements Presenter{
	
	private PainelEscolhaModuloView pemv;
	private final HandlerManager eventBus;
	
	public PainelEscolhaModuloPresenter(PainelEscolhaModuloView pemv,HandlerManager eventBus ){
		this.pemv = pemv;
		this.eventBus = eventBus;
	}

	public void go(HasWidgets container, HasWidgets containerDois) {
		
		
	}

}
