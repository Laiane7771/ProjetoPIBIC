package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerenteImprimirCrachaCoordenadorView;



public class GerenteImprimirCrachaCoordenadorPresenter implements Presenter{
	
	private GerenteImprimirCrachaCoordenadorView gicv;
	private final HandlerManager eventBus;
	
	public GerenteImprimirCrachaCoordenadorPresenter(GerenteImprimirCrachaCoordenadorView gicv, HandlerManager eventBus){
		this.gicv = gicv;
		this.eventBus = eventBus;
		
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(gicv.asWidget());
		
	}

}
