package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerentePesquisarEventoView;

public class GerentePesquisaEventoPresenter implements Presenter {
	
	private GerentePesquisarEventoView gpev;
	private HandlerManager eventBus;
	
	public GerentePesquisaEventoPresenter(GerentePesquisarEventoView gpev, HandlerManager eventBus){
		this.gpev = gpev;
		this.eventBus = eventBus;
	}

	public void bind(){
		
		
		
		
	}


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.clear();
		container.add(gpev.asWidget());
	}
}
