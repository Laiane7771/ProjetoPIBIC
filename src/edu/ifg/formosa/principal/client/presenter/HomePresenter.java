package edu.ifg.formosa.principal.client.presenter;

import java.util.ArrayList;
import java.util.Vector;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.PrincipalServiceAsync;
import edu.ifg.formosa.principal.client.event.EntrarEvent;
import edu.ifg.formosa.principal.client.view.HomeView;
import edu.ifg.formosa.principal.shared.Evento;

public class HomePresenter implements Presenter{

	private HomeView homeView;
	private final HandlerManager eventBus;
	private int index = 0;
	private final PrincipalServiceAsync rpcService; 


	public HomePresenter(HomeView homeView, HandlerManager eventBus, PrincipalServiceAsync rpcService){
		this.rpcService = rpcService;
		this.homeView = homeView;
		this.eventBus = eventBus;
		bind();
		
	}

	public void bind(){
		
		homeView.getLbEntrar().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EntrarEvent());

			}
		});
		homeView.getLbCertificado().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EntrarEvent());
			}
		});
		
		homeView.getBtnPesquisar().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("Aqui no botao ");
				rpcService.buscarEventos("a", new AsyncCallback<ArrayList<Evento>>() {
					
					@Override
					public void onSuccess(ArrayList<Evento> result) {
						Window.alert("ok");
						GWT.log("Aqui no botao ok");
					}
					
					@Override
					public void onFailure(Throwable caught) {
						Window.alert("erro");
						GWT.log("Aqui no botao erro");
					}
				});
				
			}
		});

	}


	
	public void preencheTabela(Vector<Vector<String>> listaEventos){
		homeView.getFtTabelaEvento().clear();
	
		
		Vector<String> colunas = new Vector<String>();
		colunas.add("id");
		colunas.add("Nome");
		colunas.add("Organizador(a)");
		colunas.add("Descrição");

		for(int a = 0; a<40; a++){
			for(int b =0; b<40; b++){
				homeView.getFtTabelaEvento().setText(a, b, ""+colunas);
			}
		}
	}

	public void go(HasWidgets container, HasWidgets containerDois) {
		container.add(homeView.asWidget());
		bind();
		
	}

	
}
