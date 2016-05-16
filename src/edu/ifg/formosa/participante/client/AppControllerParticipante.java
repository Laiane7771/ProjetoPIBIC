package edu.ifg.formosa.participante.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.participante.client.event.InscreverAtividadeEvent;
import edu.ifg.formosa.participante.client.event.InscreverAtividadeEventHandler;
import edu.ifg.formosa.participante.client.presenter.HomeTelaInicialParticipantePresenter;
import edu.ifg.formosa.participante.client.presenter.MenuTelaInicialParticipantePresenter;
import edu.ifg.formosa.participante.client.presenter.ParticipantePesquisarAtividadesPopupPresenter;
import edu.ifg.formosa.participante.client.presenter.ParticipanteRodapePresenter;
import edu.ifg.formosa.participante.client.presenter.Presenter;
import edu.ifg.formosa.participante.client.view.HomeTelaInicialParticipanteView;
import edu.ifg.formosa.participante.client.view.MenuTelaInicialParticipanteView;
import edu.ifg.formosa.participante.client.view.ParticipantePesquisarAtividadePopupView;
import edu.ifg.formosa.participante.client.view.ParticipanteRodapeView;


public class AppControllerParticipante implements Presenter, ValueChangeHandler<String>{

	private final HandlerManager eventBus;
	private HasWidgets container1;
	private HasWidgets container2;
	private HasWidgets container3;
	
	public AppControllerParticipante(HandlerManager eventBus){
		this.eventBus = eventBus;
		bind();
	}
	
	private void bind(){
		
		History.addValueChangeHandler(this);
		eventBus.addHandler(InscreverAtividadeEvent.TYPE, new InscreverAtividadeEventHandler() {
			
			@Override
			public void alterarEvento(InscreverAtividadeEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("listaratividades");
				}
				
				
			}
		});
	
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();
		Presenter presenter = null;
		if(token.equals("home")){
			
			
		}
		if(token.equals("listaratividades")){
			ParticipantePesquisarAtividadePopupView atividades = new ParticipantePesquisarAtividadePopupView();
			new ParticipantePesquisarAtividadesPopupPresenter(atividades);
			
		}
	}

	public void go(HasWidgets container, HasWidgets containerDois, HasWidgets containerTres) {
		this.container1 = container;
		this.container2 = containerDois;
		this.container3 = containerTres;
		
		MenuTelaInicialParticipanteView mtipv = new MenuTelaInicialParticipanteView();
		MenuTelaInicialParticipantePresenter  mtipp = new MenuTelaInicialParticipantePresenter(mtipv, eventBus);
		container.add(mtipv.asWidget());
		
		HomeTelaInicialParticipanteView homeTelaInicial = new HomeTelaInicialParticipanteView();
		HomeTelaInicialParticipantePresenter homePresenter = new HomeTelaInicialParticipantePresenter(homeTelaInicial, eventBus);
		containerDois.add(homeTelaInicial.asWidget());
		
		ParticipanteRodapeView rodape = new ParticipanteRodapeView();
		new ParticipanteRodapePresenter(rodape);
		containerTres.add(rodape.asWidget());
		
		if("".equals(History.getToken())){
			History.newItem("home");
		}
		
		else{
			History.fireCurrentHistoryState();
		}
		
	}
}
