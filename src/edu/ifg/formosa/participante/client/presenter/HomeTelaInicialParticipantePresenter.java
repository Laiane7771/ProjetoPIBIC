package edu.ifg.formosa.participante.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.participante.client.view.HomeTelaInicialParticipanteView;

public class HomeTelaInicialParticipantePresenter implements Presenter{

	private HomeTelaInicialParticipanteView hometelaInicial;
	private final HandlerManager eventBus;

	
	public HomeTelaInicialParticipantePresenter(HomeTelaInicialParticipanteView hometelaInicial, HandlerManager eventBus){
		this.hometelaInicial = hometelaInicial;
		bind();
		this.eventBus = eventBus;
	}
	
	public void bind(){
		
	}
	
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(hometelaInicial.asWidget());
		
	}

}
