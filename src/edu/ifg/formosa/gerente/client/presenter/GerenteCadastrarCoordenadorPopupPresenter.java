package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerenteCadastrarCoordenadorPopupView;



public class GerenteCadastrarCoordenadorPopupPresenter implements Presenter{

	
	private GerenteCadastrarCoordenadorPopupView gccpv;
	private final HandlerManager eventBus;
	
	public GerenteCadastrarCoordenadorPopupPresenter(GerenteCadastrarCoordenadorPopupView gccpv, HandlerManager eventBus){
		this.gccpv = gccpv;
		this.eventBus = eventBus;
		bind();
	}
	
	public void bind(){
		
		gccpv.getBtnFecharPopup().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				gccpv.hide();
				
			}
		});
		
		gccpv.getBtnVoltarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				gccpv.hide();
			}
		});
		
	}
	


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
