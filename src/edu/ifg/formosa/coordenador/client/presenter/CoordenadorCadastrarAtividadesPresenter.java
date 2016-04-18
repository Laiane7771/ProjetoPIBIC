package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.event.PesquisarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.view.CoordenadorCadastrarAtividadesView;

public class CoordenadorCadastrarAtividadesPresenter implements Presenter{
	
	private CoordenadorCadastrarAtividadesView CadastrarAtividade;
	private final HandlerManager eventBus;

	public CoordenadorCadastrarAtividadesPresenter(CoordenadorCadastrarAtividadesView CadastrarAtividade,
			HandlerManager eventBus){
		this.CadastrarAtividade = CadastrarAtividade;
		this.eventBus = eventBus;
		bind();
	}
	
	public void bind(){
		CadastrarAtividade.getBtnCadastrarAtividade().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
		CadastrarAtividade.getBtnVoltarA().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarAtividadeEvent());
				
			}
		});
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		
		containerDois.add(CadastrarAtividade.asWidget());
	}
}
