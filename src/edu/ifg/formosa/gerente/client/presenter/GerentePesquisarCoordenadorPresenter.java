package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerentePesquisarCoordenadorView;

public class GerentePesquisarCoordenadorPresenter implements Presenter{
	
	private GerentePesquisarCoordenadorView gpcv;
	private HandlerManager eventBus;
	
	public GerentePesquisarCoordenadorPresenter(GerentePesquisarCoordenadorView gpcv, HandlerManager eventBus){
		this.gpcv = gpcv;
		this.eventBus = eventBus;
	}

	
	public void bind(){
		gpcv.getBtnExcluirSelecionados().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(gpcv.asWidget());
		
	}

}
