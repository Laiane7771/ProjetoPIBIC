package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.view.CoordenadorPesquisarAtividadesPopupView;

public class CoordenadorPesquisarAtividadePopupPresenter implements Presenter{
	
	private CoordenadorPesquisarAtividadesPopupView pesquisarAtividades;
	private final HandlerManager eventBus;

	public CoordenadorPesquisarAtividadePopupPresenter(CoordenadorPesquisarAtividadesPopupView pesquisarAtividades, 
			HandlerManager eventBus){
		this.pesquisarAtividades = pesquisarAtividades;
		this.eventBus = eventBus;
	}
	
	public void bind(){
		
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(pesquisarAtividades.asWidget());
		
	}
}
