package edu.ifg.formosa.participante.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.participante.client.view.MenuTelaInicialParticipanteView;

public class MenuTelaInicialParticipantePresenter implements Presenter{
	
	private MenuTelaInicialParticipanteView MenuTelaInicial;
	private final HandlerManager eventBus;
	
	public MenuTelaInicialParticipantePresenter(MenuTelaInicialParticipanteView MenuTelaInicial,HandlerManager eventBus){
		this.MenuTelaInicial = MenuTelaInicial;
		this.eventBus = eventBus;
		bind();
	}
	public void bind(){
		
	}
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(MenuTelaInicial);
		
	}

}
