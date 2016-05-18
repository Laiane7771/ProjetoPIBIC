package edu.ifg.formosa.gerente.client.presenter;


import java.util.ArrayList;
import java.util.Iterator;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import edu.ifg.formosa.gerente.client.GerenteServiceAsync;
import edu.ifg.formosa.gerente.client.view.GerentePesquisarAtividadesPopupView;
import edu.ifg.formosa.gerente.client.view.HomeGerenteView;
import edu.ifg.formosa.gerente.shared.Evento;


public class HomeGerentePresenter  implements Presenter{

	private HomeGerenteView hvg;
	private final HandlerManager eventBus;
	private final GerenteServiceAsync rpcService;

	public HomeGerentePresenter( HomeGerenteView hvg, HandlerManager eventBus, GerenteServiceAsync rpcService){
		this.hvg = hvg;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
	}
	
	public void bind(){
		
		ArrayList<Widget> colunas = new ArrayList<Widget>();
		HTML nomeColuna = new HTML("Nome");
		HTML dataInicio = new HTML("Data Inicio");
		HTML dataFim = new HTML("Data de Encerramento");
		HTML inscreva = new HTML("Inscreva-se");

		colunas.add(nomeColuna);
		colunas.add(dataInicio);
		colunas.add(dataFim);
		colunas.add(inscreva);
		
		rpcService.buscarEventos(null, new AsyncCallback<ArrayList<Evento>>() {

			@Override
			public void onSuccess(ArrayList<Evento> result) {
				Window.alert("ok");
				GWT.log("Aqui no botao ok");
				Iterator<Evento> eventos = result.iterator();

				ArrayList<ArrayList<Widget>> dadosTabelaEventos = new ArrayList<ArrayList<Widget>>();
				while(eventos.hasNext()){
					Evento e = eventos.next();

					HTML nomeEvento = new HTML(e.getNomeEvento());
					HTML dataEventoInicio = new HTML(e.getDataInicio());
					HTML dataEventoFim = new HTML(e.getDataEncerra());


					ArrayList<Widget> linhaTabelaEventos = new ArrayList<Widget>();
					linhaTabelaEventos.add(nomeEvento);
					linhaTabelaEventos.add(dataEventoInicio);
					linhaTabelaEventos.add(dataEventoFim);

					dadosTabelaEventos.add(linhaTabelaEventos);
					//criar botao

				}
				hvg.getFtTabelaEvento().preencheTabela(dadosTabelaEventos);

			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("erro");
				GWT.log("Aqui no botao erro");
			}
		});

		
		hvg.getBtnExcluirSelecionados().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
							
			}
		});
		
		hvg.getBtnPesquisar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Evento evento = new Evento();
				evento.setNomeEvento(hvg.getTbPesquisarEvento().getText());
				
				GWT.log("Aqui no botao ");
				rpcService.buscarEventos(evento, new AsyncCallback<ArrayList<Evento>>() {

					@Override
					public void onSuccess(ArrayList<Evento> result) {
						Window.alert("ok");
						GWT.log("Aqui no botao ok");
						Iterator<Evento> eventos = result.iterator();
						ArrayList<ArrayList<Widget>> dadosTabelaEventos = new ArrayList<ArrayList<Widget>>();
						while(eventos.hasNext()){
							final Evento e = eventos.next();

							HTML nomeEvento = new HTML(e.getNomeEvento());
							HTML dataEventoInicio = new HTML(e.getDataInicio());
							HTML dataEventoFim = new HTML(e.getDataEncerra());
						
							ArrayList<Widget> linhaTabelaEventos = new ArrayList<Widget>();
							linhaTabelaEventos.add(nomeEvento);
							linhaTabelaEventos.add(dataEventoInicio);
							linhaTabelaEventos.add(dataEventoFim);
							//linhaTabelaEventos.add(link);
							dadosTabelaEventos.add(linhaTabelaEventos);
		

						}
						hvg.getFtTabelaEvento().preencheTabela(dadosTabelaEventos);

					}

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("erro");
						GWT.log("Aqui no botao erro");
					}
				});
			}
		});
		
		hvg.getBtnListarAtividadesEvento().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				GWT.log("aqui no botao");
				GerentePesquisarAtividadePopupPresenter gpapp = new GerentePesquisarAtividadePopupPresenter(
						new GerentePesquisarAtividadesPopupView());
				
			}
		});
		
	}


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(hvg.asWidget());
		
		
	}	
}
