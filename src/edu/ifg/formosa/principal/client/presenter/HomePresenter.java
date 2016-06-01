package edu.ifg.formosa.principal.client.presenter;

import java.util.ArrayList;
import java.util.Iterator;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import edu.ifg.formosa.principal.client.PrincipalServiceAsync;
import edu.ifg.formosa.principal.client.event.EntrarEvent;
import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
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

		ArrayList<Widget> colunas = new ArrayList<Widget>();
		HTML nomeColuna = new HTML("Nome");
		HTML dataInicio = new HTML("Data Inicio");
		HTML dataFim = new HTML("Data de Encerramento");
		HTML inscreva = new HTML("Inscreva-se");
		HTML detalhes = new HTML("Detalhes");

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

				ArrayList<ArrayList<Widget>> dadosTabelaEventos = 
						new ArrayList<ArrayList<Widget>>();
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

				}
				homeView.getFtTabelaEvento().preencheTabela(dadosTabelaEventos);

			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("erro");
				GWT.log("Aqui no botao erro");
			}
		});

		homeView.getFtTabelaEvento().prencheCabecalho(colunas);



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
					
				Evento evento = new Evento();
				evento.setNomeEvento(homeView.getFieldEvento().getText());
				
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
							
							Anchor link = new Anchor("Inscrever-se");
							link.addClickHandler(new ClickHandler() {
								
								@Override
								public void onClick(ClickEvent event) {
									EscolhaModuloView esc = new EscolhaModuloView();
									new EscolhaModuloPresenter(esc, rpcService, e.getIdEvento());
								}
							});

							//
							ArrayList<Widget> linhaTabelaEventos = new ArrayList<Widget>();
							linhaTabelaEventos.add(nomeEvento);
							linhaTabelaEventos.add(dataEventoInicio);
							linhaTabelaEventos.add(dataEventoFim);
							linhaTabelaEventos.add(link);
							dadosTabelaEventos.add(linhaTabelaEventos);
							//criar botao

						}
						homeView.getFtTabelaEvento().preencheTabela(dadosTabelaEventos);

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


	

	public void go(HasWidgets container, HasWidgets containerDois) {
		container.add(homeView.asWidget());
		bind();

	}


}
