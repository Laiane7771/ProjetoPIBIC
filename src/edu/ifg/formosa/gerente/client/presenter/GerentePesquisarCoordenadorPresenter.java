package edu.ifg.formosa.gerente.client.presenter;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import edu.ifg.formosa.gerente.client.GerenteServiceAsync;
import edu.ifg.formosa.gerente.client.view.GerentePesquisarCoordenadorView;
import edu.ifg.formosa.gerente.shared.Coordenador;

public class GerentePesquisarCoordenadorPresenter implements Presenter{

	private GerentePesquisarCoordenadorView gpcv;
	private HandlerManager eventBus;
	private final GerenteServiceAsync rpcServiceGerente;


	public GerentePesquisarCoordenadorPresenter(GerentePesquisarCoordenadorView gpcv, HandlerManager eventBus,
			GerenteServiceAsync rpcServiceGerente){
		this.gpcv = gpcv;
		this.eventBus = eventBus;
		this.rpcServiceGerente = rpcServiceGerente;
		bind();
	}


	public void bind(){

		ArrayList<Widget> colunas = new ArrayList<Widget>();
		HTML nomeColuna = new HTML("Nome");
		HTML evento = new HTML("Evento");

		colunas.add(nomeColuna);
		colunas.add(evento);

		rpcServiceGerente.buscaCoordenadorPorNome("", new AsyncCallback<ArrayList<Coordenador>>() {

			public void onSuccess(java.util.ArrayList<Coordenador> result) {
				Window.alert("sucesso");

				Iterator<Coordenador> coordenadores = result.iterator();

				ArrayList<ArrayList<Widget>> dadosTabelaEventos = 
						new ArrayList<ArrayList<Widget>>();
				while(coordenadores.hasNext()){
					Coordenador e = coordenadores.next();

					HTML nomeCoordenador = new HTML(e.getUsuario().getNome());
					HTML matricula = new HTML(e.getMatriculaSiape());


					ArrayList<Widget> linhaTabelaEventos = new ArrayList<Widget>();
					linhaTabelaEventos.add(nomeCoordenador);
					linhaTabelaEventos.add(matricula);


					dadosTabelaEventos.add(linhaTabelaEventos);
					
				}
				gpcv.getFtTabelaCoordenador().preencheTabela(dadosTabelaEventos);
				
			};
			
			public void onFailure(Throwable caught) {
				Window.alert("erro");
				GWT.log("Aqui no botao erro");
			};
		});



		/*
		 */

		gpcv.getBtnExcluirSelecionados().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub

			}
		});

		gpcv.getBtnPesquisar().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub

			}
		});
	}



	public void go(HasWidgets container, HasWidgets containerDois, HasWidgets containerTres) {
		containerDois.add(gpcv.asWidget());

	}

}

