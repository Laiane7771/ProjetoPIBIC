package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.event.PesquisarEventoEvent;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarCoordenadorPopupView;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarEventoView;

public class GerenteCadastrarEventoPresenter implements Presenter {
	
	private GerenteCadastrarEventoView gcev;
	private final HandlerManager eventBus;
	
	public GerenteCadastrarEventoPresenter(GerenteCadastrarEventoView gcev, HandlerManager eventBus){
		this.gcev = gcev;
		this.eventBus = eventBus;
		bind();
	}
	
	public void bind(){
		
		gcev.getBtnCadastrarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				GerenteCadastrarCoordenadorPopupView gccpv = new GerenteCadastrarCoordenadorPopupView();
				new GerenteCadastrarCoordenadorPopupPresenter(gccpv, eventBus);
				
			}
		});
		gcev.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarEventoEvent());
				
			}
		});
	}

	

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
	bind();
		
	}

	
}
