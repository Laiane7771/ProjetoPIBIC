package edu.ifg.formosa.principal.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.event.EntrarEvent;
import edu.ifg.formosa.principal.client.event.EntrarEventHandler;
import edu.ifg.formosa.principal.client.presenter.EscolhaModuloPresenter;
import edu.ifg.formosa.principal.client.presenter.HomePresenter;
import edu.ifg.formosa.principal.client.presenter.HomeTestePresenter;
import edu.ifg.formosa.principal.client.presenter.PainelEscolhaModuloPresenter;
import edu.ifg.formosa.principal.client.presenter.Presenter;
import edu.ifg.formosa.principal.client.presenter.TelaInicialPresenter;
import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
import edu.ifg.formosa.principal.client.view.HomeTesteView;
import edu.ifg.formosa.principal.client.view.HomeView;
import edu.ifg.formosa.principal.client.view.PainelEscolhaModuloView;
import edu.ifg.formosa.principal.client.view.TelaInicialView;

public class AppController  implements Presenter, ValueChangeHandler<String>{

	private HasWidgets container;
	private final HandlerManager eventBus;
	private PainelEscolhaModuloPresenter pep;
	

	public AppController(HandlerManager eventBus){ 
		this.eventBus = eventBus;
		bind();
	}

	private void bind(){ 
		History.addValueChangeHandler(this);
		
		eventBus.addHandler(EntrarEvent.TYPE, new EntrarEventHandler() {
			public void entrar(EntrarEvent event) {
				
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				if("home".equals(History.getToken())){
					History.newItem("entrar");
				}
				if ("comofunciona".equals(History.getToken())) {
					History.newItem("entrar");
				}
				else {
					History.fireCurrentHistoryState();
				}
			}
		});
		
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();
		if (token != null) {
			Presenter presenter = null;

			if(token.equals("entrar")){
				
				presenter = new EscolhaModuloPresenter(new EscolhaModuloView());
			}
			
			if (presenter != null) {
				presenter.go(container, null);
			}
		}
	}

	public void go(HasWidgets container, HasWidgets containerDois) {

		GWT.log("go");
		this.container = container;

		Presenter presenter = null;

		HomeView homeView = new HomeView();
		HomePresenter homePresenter = new HomePresenter(homeView, eventBus);
		container.add(homeView.asWidget());
		
		if ("".equals(History.getToken())) {
			History.newItem("home");
		}
		else {
			History.fireCurrentHistoryState();
		}	
	}
}
