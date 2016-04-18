package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarCoordenadorView;

public class GerenteCadastrarCoordenadorPresenter  implements Presenter{

	private GerenteCadastrarCoordenadorView gccv;
	private final HandlerManager eventBus;
	
	public GerenteCadastrarCoordenadorPresenter(GerenteCadastrarCoordenadorView gccv, HandlerManager eventBus){
		this.gccv = gccv;
		this.eventBus = eventBus;
		bind();
	}

	public void bind(){
		
		gccv.getBtnSalvarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
			}
		});
		
		gccv.getBtnVoltarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarCoordenadorEvent());
				
			}
		});
		
	}
	


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(gccv.asWidget());
		
	}
}
