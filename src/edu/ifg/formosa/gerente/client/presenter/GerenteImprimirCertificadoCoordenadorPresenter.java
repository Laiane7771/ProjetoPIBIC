package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerenteImprimirCertificadoCoordenadorView;

public class GerenteImprimirCertificadoCoordenadorPresenter implements Presenter{

	private GerenteImprimirCertificadoCoordenadorView giccv;
	private final HandlerManager eventBus;
	
	public GerenteImprimirCertificadoCoordenadorPresenter(GerenteImprimirCertificadoCoordenadorView giccv, HandlerManager eventBus){
		this.giccv = giccv;
		this.eventBus = eventBus;
	}
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(giccv.asWidget());
		
	}

}
